package com.study.map;

import com.study.str.GlobalFilterEnum;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GlobalFilterBrandIndexSummaryDTO {

    private GlobalFilterEnum globalFilter;
    private List<BrandRankingGoodsDTO> rankingGoodsList;
    private List<Long> exclusiveGoodsIds;
    private Integer goodsCount;

    @Builder
    @Getter
    public static class BrandRankingGoodsDTO {
        private Long goodsNo;
        private String goodsImage;

        public static BrandRankingGoodsDocument toBrandRankingGoodsDocument(BrandRankingGoodsDTO dto) {
            return BrandRankingGoodsDocument.builder()
                .goodsNo(dto.getGoodsNo())
                .goodsImage(dto.getGoodsImage())
                .build();
        }
    }
}
