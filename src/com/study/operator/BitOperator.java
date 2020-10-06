package com.study.operator;

import java.util.Arrays;

public class BitOperator {

    public static void main(String[] args) {

        final int source = 14;
        final int enumValue = 8;

        int[] findValues = {2,4,8};

        int bitOperatorResult = source & enumValue;

        System.out.println("bit operator = " + bitOperatorResult);

        if (Arrays.stream(findValues).anyMatch(x -> x == bitOperatorResult)) {
            System.out.println("비트연산 성공");
        } else {
            System.out.println("비트연산 실패");
        }

    }
}
