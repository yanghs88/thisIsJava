package com.study.stat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@lombok.Data
public class Data {
    @Getter(onMethod_ = {@JsonProperty("purchase")})
    @Setter(onMethod_ = {@JsonProperty("purchase")})
    private Purchase purchase;
    @Getter(onMethod_ = {@JsonProperty("brand")})
    @Setter(onMethod_ = {@JsonProperty("brand")})
    private String brand;
    @Getter(onMethod_ = {@JsonProperty("purchase_by_m")})
    @Setter(onMethod_ = {@JsonProperty("purchase_by_m")})
    private Purchase purchaseByM;
    @Getter(onMethod_ = {@JsonProperty("purchase_by_w")})
    @Setter(onMethod_ = {@JsonProperty("purchase_by_w")})
    private Purchase purchaseByW;
}
