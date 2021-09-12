package com.jomilto.javatest.util;

public class RomanNumerals implements IRomanEquivalents{

    public static String arabicToRoman(int n) {
        StringBuilder roman = new StringBuilder();
        int resto = n;

        for (RomanEquivalent eq: EQUIVALENTS) {
            if(resto / eq.arabic >= 0){
                int times;
                times = Math.round(resto/eq.arabic);
                String value = eq.roman;
                resto -= (times * eq.arabic);
                roman.append(StringUtil.repetirCadena(times, value));
            }
        }

        return roman.toString();
    }
}
