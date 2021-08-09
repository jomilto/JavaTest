package com.jomilto.javatest.util;

import org.junit.Test;

import static com.jomilto.javatest.util.PasswordValidator.*;
import static org.junit.Assert.*;

public class PasswordValidatorTest {

    @Test
    public void weak_when_has_less_than_eight_letters(){
        assertEquals(SecurityLevel.WEAK, passwordValidator("asdsads"));
    }

    @Test
    public void weak_when_has_letters_and_numbers_and_has_less_than_eight_letters(){
        assertEquals(SecurityLevel.WEAK, passwordValidator("asd1232"));
    }

    @Test
    public void weak_when_has_only_letters(){
        assertEquals(SecurityLevel.WEAK, passwordValidator("asdsads"));
    }

    @Test
    public void medium_when_has_letters_and_numbers(){
        assertEquals(SecurityLevel.MEDIUM, passwordValidator("asds1232"));
    }

    //@Test(expected = IllegalArgumentException.class)
    @Test
    public void strong_when_has_letters_and_numbers_and_symbols(){
        assertEquals(SecurityLevel.STRONG, passwordValidator("asds123!"));
    }
}