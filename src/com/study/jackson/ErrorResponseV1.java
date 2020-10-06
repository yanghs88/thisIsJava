package com.study.jackson;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ErrorResponseV1 {
    @Builder.Default
    private String code = "COMMON-001-0000";

    @Builder.Default
    private String message = "서비스가 정상적이지 않습니다.";

    @Builder.Default
    private String usermessage = "오류가 발생했습니다. 다시 시도해주시기 바랍니다.";
}
