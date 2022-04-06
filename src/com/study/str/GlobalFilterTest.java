package com.study.str;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GlobalFilterTest {

    public static void main(String[] args) {

        Collection<GlobalFilterEnum> availableFilters = GlobalFilterEnum.AVAILABLE_FILTERS;
        availableFilters.forEach(globalFilterEnum -> System.out
            .println("globalFilterEnum = " + globalFilterEnum.getIndex()));

        List<String> strings = Arrays.asList("A", "B", "C");
        System.out.println("strings.get(0) = " + strings.get(0));

    }
}


