package com.study.chapter5;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;
import lombok.Getter;

@Getter
public enum GlobalFilterEnum {
    ALL("A"),
    MEN("M"), // M+K+E
    WOMEN("F"), // W+K+E
    NONE("NONE"); // 오류

    private String code;

    GlobalFilterEnum(String code) {
        this.code = code;
    }

    public static GlobalFilterEnum findByFilterCode(final String filterCode) {
        return Arrays.stream(GlobalFilterEnum.values())
            .filter(kind -> kind.code.equals(filterCode))
            .findAny()
            .orElse(NONE);
    }

    public static boolean validate(final String code) {
        return !Objects.isNull(code)
            && Arrays.stream(GlobalFilterEnum.values())
            .filter(Predicate.isEqual(GlobalFilterEnum.NONE).negate())
            .anyMatch(kind -> kind.code.equals(code));


    }
}
