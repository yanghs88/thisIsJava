package com.study.stat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

public class Response {
    @Getter(onMethod_ = {@JsonProperty("code")})
    @Setter(onMethod_ = {@JsonProperty("code")})
    private String code;
    @Getter(onMethod_ = {@JsonProperty("message")})
    @Setter(onMethod_ = {@JsonProperty("message")})
    private String message;
    @Getter(onMethod_ = {@JsonProperty("data")})
    @Setter(onMethod_ = {@JsonProperty("data")})
    private Data data;
}
