package com.itv.petstore5.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MobileValidators  implements ConstraintValidator<mobile,String> {

    

   @Override
   public boolean isValid(String value, ConstraintValidatorContext context) {
      boolean condition =value.length()==10 && value.matches("[0-9]+");
      return condition;
   }
   
}
