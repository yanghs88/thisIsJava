package com.study.map;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BrandGoodsCountDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String brand;
    private Integer count;
    private Integer saleCount;
    private Integer newCount;

}
