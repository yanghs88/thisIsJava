package com.study.jackson;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            String json = "{\"error\":{\"code\":\"DISPLAY-000-0001\",\"message\":\"관리자 타입이 없습니다.\",\"usermessage\":\"오류가 발생했습니다. 다시 시도해주시기 바랍니다.\"}}";
            BaseResponseV1 baseResponseV1 = mapper.readValue(json, BaseResponseV1.class);

            System.out.println("baseResponseV1 = " + baseResponseV1.toString());


        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
