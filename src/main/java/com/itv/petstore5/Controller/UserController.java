package com.itv.petstore5.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itv.petstore5.Services.UserService;
import com.itv.petstore5.dtos.RegisterDto;

import jakarta.validation.Valid;

@RestController
public class UserController {
    @Autowired
    private UserService userServices;
//adding data
    @PostMapping("/users")
    public ResponseEntity<?> registerUser(@RequestBody  @Valid RegisterDto registerUserDto)
    {
        return  new  ResponseEntity<>(this.userServices.registerUser(registerUserDto),HttpStatus.CREATED);
    }
    @GetMapping("/users")
   public ResponseEntity<?>getAll()
   {
    return ResponseEntity.ok(this.userServices.getAll());
   }
}
