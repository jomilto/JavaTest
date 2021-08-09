package com.jomilto.javatest.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void any_string() {
        assertTrue(StringUtil.isEmpty("cadena de ejemplo"));
    }

    @Test
    public void empty_string() {
        assertFalse(StringUtil.isEmpty(""));
    }

    @Test
    public void null_string() {
        assertFalse(StringUtil.isEmpty(null));
    }

    @Test
    public void blank_space_string() {
        assertFalse(StringUtil.isEmpty(" "));
    }
}