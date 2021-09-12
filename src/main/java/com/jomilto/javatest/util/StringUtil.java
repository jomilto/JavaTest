package com.jomilto.javatest.util;

public class StringUtil {

    static boolean isEmpty(String str){

        if(str == null){
            return false;
        }

        return str.trim().length() != 0;
    }

     static String repetirCadena(int times, String value){
        StringBuilder cadena = new StringBuilder();
        while(times-- > 0){
            cadena.append(value);
        }
        return cadena.toString();
    }
}
