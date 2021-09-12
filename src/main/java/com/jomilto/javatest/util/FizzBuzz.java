package com.jomilto.javatest.util;

public class FizzBuzz {
    public static String fizzBuzz(int n) {
        if(n % 5 == 0 && n % 3 == 0){
            return "FizzBuzz";
        }
        if(n % 3 == 0){
            return "Fizz";
        }
        if(n % 5 == 0){
            return "Buzz";
        }
        return Integer.toString(n);
    }
}
