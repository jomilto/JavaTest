package com.jomilto.javatest.util;

public class StringUtil {

    static boolean isEmpty(String str){

        if(str == null){
            return false;
        }

        return str.trim().length() != 0;
    }
}
