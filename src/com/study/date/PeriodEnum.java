package com.study.date;

import java.time.LocalDateTime;

public enum PeriodEnum {

    WAITING("대기"),
    PROGRESS("진행중"),
    END("종료");

    private String description;

    PeriodEnum(String description) {
        this.description = description;
    }

    public static PeriodEnum find(LocalDateTime startDate, LocalDateTime endDate) {
        if (DateUtil.now().isBefore(startDate)) {
            return PeriodEnum.WAITING;
        }
        if (DateUtil.now().isAfter(endDate)) {
            return PeriodEnum.END;
        }
        return PeriodEnum.PROGRESS;
    }
}
