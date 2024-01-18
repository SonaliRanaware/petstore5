package com.itv.petstore5.dtos;

import com.itv.petstore5.validators.VerifyPassword;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@VerifyPassword(Filed="password" ,matchingFiled = "confirmPassword")

public class RegisterDto {
    private Integer id;
    @NotNull @NotEmpty
    @Size(min=4 ,max=10,message="first name should have length btw 4 to 10")
private String firstname;
@NotNull @NotEmpty
    private String lastname;
    @NotNull @NotEmpty
    private String email;
  

    private String password;
    private String confirmPassword;
    @NotNull @NotEmpty
    @com.itv.petstore5.validators.mobile
        private String mobile;
    
   @Min(value=10000,message="min salary should be 10000")
   @Max(value=100000,message="max salary should be 100000")
    private long salary;
   

}
