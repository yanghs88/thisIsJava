package com.study.stat;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Purchase {
    @Getter(onMethod_ = {@JsonProperty("age_band.0")})
    @Setter(onMethod_ = {@JsonProperty("age_band.0")})
    private long ageBand0;
    @Getter(onMethod_ = {@JsonProperty("age_band.19")})
    @Setter(onMethod_ = {@JsonProperty("age_band.19")})
    private long ageBand19;
    @Getter(onMethod_ = {@JsonProperty("age_band.24")})
    @Setter(onMethod_ = {@JsonProperty("age_band.24")})
    private long ageBand24;
    @Getter(onMethod_ = {@JsonProperty("age_band.29")})
    @Setter(onMethod_ = {@JsonProperty("age_band.29")})
    private long ageBand29;
    @Getter(onMethod_ = {@JsonProperty("age_band.34")})
    @Setter(onMethod_ = {@JsonProperty("age_band.34")})
    private long ageBand34;
    @Getter(onMethod_ = {@JsonProperty("age_band.40")})
    @Setter(onMethod_ = {@JsonProperty("age_band.40")})
    private long ageBand40;
    @Getter(onMethod_ = {@JsonProperty("gender.F")})
    @Setter(onMethod_ = {@JsonProperty("gender.F")})
    private long genderF;
    @Getter(onMethod_ = {@JsonProperty("gender.M")})
    @Setter(onMethod_ = {@JsonProperty("gender.M")})
    private long genderM;
    @Getter(onMethod_ = {@JsonProperty("gender.N")})
    @Setter(onMethod_ = {@JsonProperty("gender.N")})
    private long genderN;
    @Getter(onMethod_ = {@JsonProperty("total")})
    @Setter(onMethod_ = {@JsonProperty("total")})
    private long total;
    @Getter(onMethod_ = {@JsonProperty("quantity")})
    @Setter(onMethod_ = {@JsonProperty("quantity")})
    private long quantity;
    @Getter(onMethod_ = {@JsonProperty("reg_date")})
    @Setter(onMethod_ = {@JsonProperty("reg_date")})
    private OffsetDateTime regDate;
}
