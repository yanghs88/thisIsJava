package com.study.stream;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

@Getter
@Setter
@Builder
public class BrandPlanVO {

    private Integer no;

    /**
     * 상태_10:요청_20:검수_30:승인_40:완료
     */
    private Integer state;

    /**
     * 구분_1:할인전_2:사은품전_3:신규입점_4:신상품전_5:모음전
     */
    private Integer kind;

    /**
     * 제목
     */
    private String title;

    /**
     * 컨텐츠
     */
    private String contents;

    /**
     * 모바일 상단html
     */
    private String mobileContents;

    /**
     * 설명
     */
    private String description;

    /**
     * 목록_이미지
     */
    private String planPreviewImg;

    /**
     * 모바일 목록 이미지
     */
    private String planPreviewMobileImg;

    /**
     * 상세_이미지
     */
    private String planTopImg;

    /**
     * 우신사 모바일 메인 이미지
     */
    private String planWMobileImg;

    /**
     * 기획전 추가이미지
     */
    private String planExImgYn;

    /**
     * 출력순서
     */
    private Integer seq;


    /**
     * 모바일여부
     */
    private String mobileYn;

    /**
     * 댓글노출여부
     */
    private String commentYn;

    /**
     *
     */
    private String startDate;

    /**
     *
     */
    private String endDate;

    /**
     * 품목코드
     */
    private String optKindCd;

    /**
     * 매거진기사번호
     */
    private Integer articleNo;

    /**
     * 룩북 일련번호
     */
    private Integer lookbookNo;


    /**
     * 자동성별구분값(y:자동설정, n:미설정)
     */
    private String setSexYn;

    /**
     * 성별
     */
    private Integer sex;

    /**
     * 자동사이트구분값(Y:자동설정, N:미설정)
     */
    private String setSiteKindYn;

    /**
     * 사이트구분
     */
    private Integer siteKind;

    /**
     * 광고
     */
    private String adCode;


    public boolean isProgress() {

        String dateFormat = "yyyyMMddHHmm";
        int length = dateFormat.length();

        if (StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate) || startDate.length() != length || endDate.length() != length) {
            return false;
        }

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateFormat);
        LocalDateTime startDateTime = LocalDateTime.parse(startDate, dateTimeFormatter);
        LocalDateTime endDateTime = LocalDateTime.parse(endDate, dateTimeFormatter);
        LocalDateTime now = LocalDateTime.now();

        return now.isAfter(startDateTime) && now.isBefore(endDateTime);
    }
}
