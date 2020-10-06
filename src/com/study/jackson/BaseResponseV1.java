package com.study.jackson;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponseV1<T> {

    private T data;
    private ErrorResponseV1 error;
}
