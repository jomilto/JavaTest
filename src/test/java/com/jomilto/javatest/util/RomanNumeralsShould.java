package com.jomilto.javatest.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsShould {

    @Test
    public void return_I_when_number_1_is_pass(){
        assertEquals("I",RomanNumerals.arabicToRoman(1));
    }

    @Test
    public void return_II_when_number_2_is_pass(){
        assertEquals("II",RomanNumerals.arabicToRoman(2));
    }

    @Test
    public void return_III_when_number_3_is_pass(){
        assertEquals("III",RomanNumerals.arabicToRoman(3));
    }

    @Test
    public void return_V_when_number_5_is_pass(){
        assertEquals("V",RomanNumerals.arabicToRoman(5));
    }

    @Test
    public void return_VI_when_number_6_is_pass(){
        assertEquals("VI",RomanNumerals.arabicToRoman(6));
    }

    @Test
    public void return_VII_when_number_7_is_pass(){
        assertEquals("VII",RomanNumerals.arabicToRoman(7));
    }

    @Test
    public void return_X_when_number_10_is_pass(){
        assertEquals("X",RomanNumerals.arabicToRoman(10));
    }

    @Test
    public void return_XI_when_number_11_is_pass(){
        assertEquals("XI",RomanNumerals.arabicToRoman(11));
    }

    @Test
    public void return_XV_when_number_11_is_pass(){
        assertEquals("XV",RomanNumerals.arabicToRoman(15));
    }

    @Test
    public void return_XVI_when_number_16_is_pass(){
        assertEquals("XVI",RomanNumerals.arabicToRoman(16));
    }

    @Test
    public void return_L_when_number_50_is_pass(){
        assertEquals("L",RomanNumerals.arabicToRoman(50));
    }

    @Test
    public void return_LXXXI_when_number_81_is_pass(){
        assertEquals("LXXXI",RomanNumerals.arabicToRoman(81));
    }

    @Test
    public void return_LXXXV_when_number_81_is_pass(){
        assertEquals("LXXXV",RomanNumerals.arabicToRoman(85));
    }

    @Test
    public void return_CXXVI_when_number_126_is_pass(){
        assertEquals("CXXVI",RomanNumerals.arabicToRoman(126));
    }

    @Test
    public void return_MMDVII_when_number_2507_is_pass(){
        assertEquals("MMDVII",RomanNumerals.arabicToRoman(2507));
    }

    @Test
    public void return_CM_when_number_900_is_pass(){
        assertEquals("CM",RomanNumerals.arabicToRoman(900));
    }

    @Test
    public void return_CD_when_number_400_is_pass(){
        assertEquals("CD",RomanNumerals.arabicToRoman(400));
    }

    @Test
    public void return_XIX_when_number_19_is_pass(){
        assertEquals("XIX",RomanNumerals.arabicToRoman(19));
    }

    @Test
    public void return_XIV_when_number_14_is_pass(){
        assertEquals("XIV",RomanNumerals.arabicToRoman(14));
    }
}