package com.study.str;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Predicate;
import lombok.Getter;

@Getter
public enum GlobalFilterEnum {
    ALL("A" , 0),
    MEN("M", 1), // M+K+E
    WOMEN("F", 2), // W+K+E
    NONE("NONE", 999); // 오류

    private String code;
    private int index;

    public static final Collection<GlobalFilterEnum> AVAILABLE_FILTERS = Arrays.asList(
        GlobalFilterEnum.ALL,
        GlobalFilterEnum.MEN,
        GlobalFilterEnum.WOMEN
    );

    GlobalFilterEnum(String code) {
        this.code = code;
    }

    GlobalFilterEnum(String code, int index) {
        this.code = code;
        this.index = index;
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
