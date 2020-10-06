package com.study.str;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Error {
    private String code = "COMMON-001-0000";

    private String message = "서비스가 정상적이지 않습니다.";

    private String usermessage = "오류가 발생했습니다. 다시 시도해주시기 바랍니다.";
}
