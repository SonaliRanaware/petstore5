package com.itv.petstore5.validators;

import org.springframework.beans.BeanWrapperImpl;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class VerifyPasswordValidator  implements ConstraintValidator<VerifyPassword,Object> {
 private  String filed;
 private String  matchingFiled;

public void initialize(VerifyPassword   ConstraintAnnotation)
{
     this.filed=ConstraintAnnotation.Filed();
     this.matchingFiled=ConstraintAnnotation.matchingFiled();
}
    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
         Object  filedValue=new  BeanWrapperImpl(value).getPropertyValue(filed);
         Object  matchingFiledValue=new  BeanWrapperImpl(value).getPropertyValue(matchingFiled);
         return  filedValue.equals(matchingFiledValue);
    }

    
}
