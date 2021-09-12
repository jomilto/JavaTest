package com.jomilto.javatest.util;

import java.util.ArrayList;
import java.util.Arrays;

public interface IRomanEquivalents {
    ArrayList<RomanEquivalent> EQUIVALENTS= new ArrayList<>(
            Arrays.asList(
                    new RomanEquivalent(1000,"M"),
                    new RomanEquivalent(900,"CM"),
                    new RomanEquivalent(500,"D"),
                    new RomanEquivalent(400,"CD"),
                    new RomanEquivalent(100,"C"),
                    new RomanEquivalent(90,"XC"),
                    new RomanEquivalent(50,"L"),
                    new RomanEquivalent(40,"XL"),
                    new RomanEquivalent(10,"X"),
                    new RomanEquivalent(9,"IX"),
                    new RomanEquivalent(5,"V"),
                    new RomanEquivalent(4,"IV"),
                    new RomanEquivalent(1,"I")
            )
    );
}
