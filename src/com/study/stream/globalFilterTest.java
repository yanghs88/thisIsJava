package com.study.stream;

import com.study.chapter5.GlobalFilterEnum;
import java.util.Arrays;
import java.util.function.Predicate;

public class globalFilterTest {

    public static void main(String[] args) {

        boolean a = GlobalFilterEnum.validate("F");

        System.out.println("a = " + a);

//        boolean present = Arrays.stream(GlobalFilterEnum.values())
//            .filter(Predicate.isEqual(GlobalFilterEnum.NONE).negate())
//            .anyMatch(s -> s.getCode().equals("NONe"));
//
//        System.out.println("present = " + present);
    }
}
