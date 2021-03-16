package com.study.map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandStatResponseVO {

    private static final long serialVersionUID = 1L;

    private String brand;
    private StatInfo purchase;
    @JsonProperty("purchase_by_m")
    private StatInfo purchaseByMan;
    @JsonProperty("purchase_by_w")
    private StatInfo purchaseByWoman;

    @Getter
    @Setter
    public static class StatInfo {
        /**
         * 18세 이하
         */
        @JsonProperty("age_band.0")
        private int ageBand0;
        /**
         * 19~23세
         */
        @JsonProperty("age_band.19")
        private int ageBand19;
        /**
         * 24~28세
         */
        @JsonProperty("age_band.24")
        private int ageBand24;
        /**
         * 29~23세
         */
        @JsonProperty("age_band.29")
        private int ageBand29;
        /**
         * 34~39세
         */
        @JsonProperty("age_band.34")
        private int ageBand34;
        /**
         * 40세 이상
         */
        @JsonProperty("age_band.40")
        private int ageBand40;
        @JsonProperty("gender.F")
        private int genderF;
        @JsonProperty("gender.M")
        private int genderM;
        @JsonProperty("gender.N")
        private int genderN;
        @JsonProperty("total")
        private int total;
        @JsonProperty("quantity")
        private Integer quantity;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "Asia/Seoul")
        @JsonProperty("reg_date")
        private LocalDateTime regDate;
    }
}
