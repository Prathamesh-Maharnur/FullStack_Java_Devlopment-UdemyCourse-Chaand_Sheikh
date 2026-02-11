package org.studyeasy;

import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
        IntPredicate lessThan18 = value -> value < 18;
        IntPredicate moreThan18 = value -> value > 18;
        System.out.println((lessThan18).or(moreThan18).negate().test(10));

    }
}
