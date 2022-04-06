package com.study.str;

import java.util.Objects;

public class PercentTest {

    public static void main(String[] args) {

//        Float a = 0.980000019073486f;
        Float a = 0f;
        final int round = Math.round(a);

        System.out.println("a = " + getDiscountTitle(a));
    }


    public static String getDiscountTitle(Float saleRate) {
        if (Objects.isNull(saleRate)) {
            return "";
        }

        return String.format("최대 %d", Math.round(saleRate * 100)) + "%";
    }
}
