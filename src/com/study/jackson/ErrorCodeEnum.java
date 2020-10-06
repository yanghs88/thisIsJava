package com.study.jackson;

import lombok.Getter;

@Getter
public enum ErrorCodeEnum {
    /**
     * 000 : 기본 에러
     * 001 : 브랜드
     */

    DISPLAY_000_0000("DISPLAY-000-0000", "기본 오류코드", "서비스가 정상적이지 않습니다.", "오류가 발생했습니다. 다시 시도해주시기 바랍니다."),
    DISPLAY_000_0001("DISPLAY-000-0001", "기본 오류코드", "잘못된 파라미터 요청입니다.", "오류가 발생했습니다. 다시 시도해주시기 바랍니다."),
    DISPLAY_000_0002("DISPLAY-000-0002", "기본 오류코드", "존재하지 않는 데이터입니다.", "오류가 발생했습니다. 다시 시도해주시기 바랍니다."),
    DISPLAY_000_0003("DISPLAY-000-0003", "기본 오류코드", "요청한 값이 너무 큽니다.", "오류가 발생했습니다. 다시 시도해주시기 바랍니다."),

    DISPLAY_001_1000("DISPLAY-001-1000", "브랜드 오류코드", "이미 존재하는 브랜드 컨텐츠 배너 입니다.", "이미 존재하는 브랜드 컨텐츠 배너 입니다."),
    DISPLAY_001_1001("DISPLAY-001-1001", "브랜드 오류코드", "이미 존재하는 브랜드 컨텐츠 입니다.", "이미 존재하는 브랜드 컨텐츠 입니다."),
    ;

    private final String code;
    private final String description;
    private final String message;
    private final String usermessage;

    ErrorCodeEnum(final String code, final String description, final String message, final String usermessage) {
        this.code = code;
        this.description = description;
        this.message = message;
        this.usermessage = usermessage;
    }
}
