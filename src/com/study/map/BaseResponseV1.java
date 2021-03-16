package com.study.map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.study.jackson.ErrorResponseV1;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponseV1<T> {

    private String code;

    private String message;

    private T data;
}
