package com.itv.petstore5.Services;

import org.springframework.stereotype.Service;

import com.itv.petstore5.dtos.RegisterDto;

import com.itv.petstore5.entites.User;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;



@Service
public class UserService  {
    private Map<Integer,User>users=new HashMap<>();
    private AtomicInteger atomic=new AtomicInteger();
   
    
    public User registerUser(RegisterDto regResisterUserDto)
    {
        User user=new User();
       user.setId(atomic.incrementAndGet());
        user.setFirstname(regResisterUserDto.getFirstname());
         user.setLastname(regResisterUserDto.getLastname());
          user.setEmail(regResisterUserDto.getEmail());
           user.setPassword(regResisterUserDto.getPassword());
            user.setMobile(regResisterUserDto.getMobile());
               user.setSalary(regResisterUserDto.getSalary());
         return users.put(user.getId(),user);
          }

         
           public Collection<User>getAll()
    {
        return users.values();
    }
}
 
    

