package com.jomilto.javatest.util;

public class PasswordValidator {

     public enum SecurityLevel {
        WEAK,MEDIUM,STRONG
    }

    static SecurityLevel passwordValidator(String password){

         if(password.length() < 8){
             return SecurityLevel.WEAK;
         }

         if(password.matches("^[a-zA-Z]+")){
             return SecurityLevel.WEAK;
         }

        if(password.matches("^[a-zA-Z0-9]+")){
            return SecurityLevel.MEDIUM;
        }

        return SecurityLevel.STRONG;
    }
}
