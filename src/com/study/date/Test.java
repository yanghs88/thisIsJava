package com.study.date;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static final String FORMAT_DATE_TIME_MIN = "yyyyMMddHH";
    public static final String LOCAL_TIME_ZONE = "Asia/Seoul";

    public static void main(String[] args) throws UnsupportedEncodingException {
        LocalDateTime now = LocalDateTime.now(ZoneId.of(LOCAL_TIME_ZONE));
        String formatDate = now.format(DateTimeFormatter.ofPattern(FORMAT_DATE_TIME_MIN));
        System.out.println("formatDate = " + formatDate);


        Map<String, String> header = new HashMap<>();
        header.put("foo", "bar");

        String test = header.get("test");
        System.out.println("test = " + test);


        String target = "7JaR7Z2s7ISc";
        Base64.Decoder decoder = Base64.getDecoder();

        // Decoder#decode(String src)
        byte[] decodedBytes2 = decoder.decode(target);
        System.out.println(new String(decodedBytes2, "UTF-8"));


        String test2 = "%EC%96%91%ED%9D%AC%EC%84%9C";

        String enStr = URLEncoder.encode("네이버-www.naver.com", "UTF-8");
        String deStr = URLDecoder.decode(enStr, "UTF-8");

        System.out.println("enStr = " + enStr);
        System.out.println("deStr = " + deStr);

    }
}
