package com.study.chapter5;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public enum  GenderEnum {
    MEN(2, "M", "남성"),
    WOMEN(4, "W", "여성"),
    KIDS(8, "K", "키즈"),
    LIFE(16, "L", "라이프"),
    ALL(30,"A", "모두"); // 모두는 현재 DB값이 없음.

    private int value; // DB 에 저장된 값(literal)
    private String code; // 화면에 보여주는 코드값
    private String description; // 설명

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    GenderEnum(int value, String code, String description) {
        this.value = value;
        this.code = code;
        this.description = description;
    }

    public static String getCodeByValue(final int value) {

        int total = Arrays.stream(GenderEnum.values())
            .filter(Predicate.isEqual(GenderEnum.ALL).negate())
            .mapToInt(s -> s.value)
            .sum();

        double total2 = Math.pow(2, GenderEnum.values().length);

        System.out.println("total = " + total);
        System.out.println("total2 = " + total2);

        if (value <= 0 || total < value) {
            return "";
        }

        String result = "";
        for (GenderEnum gender : GenderEnum.values()) {
            if (((value & gender.value) == gender.value) && (GenderEnum.ALL.getValue() != gender.value)) {
                if (!result.equals("")) {
                    result += "+";
                }
                result += gender.code;
            }
        }
        return result;
    }

    public static String getCodeConcat(final Integer findValue) {
        int total = Arrays.stream(GenderEnum.values())
            .filter(Predicate.isEqual(GenderEnum.ALL).negate())
            .mapToInt(s -> s.value)
            .sum();

        if (findValue <= 0 || total < findValue || findValue == null) {
            return "";
        }

        return Arrays.stream(GenderEnum.values())
                .filter(gender -> ((findValue & gender.value) == gender.value) && !gender.equals(GenderEnum.ALL))
                .map(GenderEnum::getCode).collect(Collectors.joining("+"));
    }
}
