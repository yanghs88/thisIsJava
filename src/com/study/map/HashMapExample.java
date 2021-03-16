package com.study.map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class HashMapExample {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            String json = "{\n"
                + "    \"code\": \"OK\",\n"
                + "    \"message\": \"요청이 성공하였습니다.\",\n"
                + "    \"data\": {\n"
                + "        \"purchase\": {\n"
                + "            \"age_band.0\": 16033,\n"
                + "            \"age_band.19\": 48996,\n"
                + "            \"age_band.24\": 46265,\n"
                + "            \"age_band.29\": 21801,\n"
                + "            \"age_band.34\": 13547,\n"
                + "            \"age_band.40\": 11503,\n"
                + "            \"gender.F\": 69509,\n"
                + "            \"gender.M\": 86932,\n"
                + "            \"gender.N\": 1704,\n"
                + "            \"total\": 158145,\n"
                + "            \"quantity\": 454679,\n"
                + "            \"reg_date\": \"2020-10-08T12:42:26\"\n"
                + "        },\n"
                + "        \"brand\": \"vans\",\n"
                + "        \"purchase_by_m\": {\n"
                + "            \"age_band.0\": 9456,\n"
                + "            \"age_band.19\": 25783,\n"
                + "            \"age_band.24\": 26410,\n"
                + "            \"age_band.29\": 13211,\n"
                + "            \"age_band.34\": 8095,\n"
                + "            \"age_band.40\": 3977,\n"
                + "            \"gender.F\": 0,\n"
                + "            \"gender.M\": 86932,\n"
                + "            \"gender.N\": 0,\n"
                + "            \"total\": 86932,\n"
                + "            \"quantity\": 280323,\n"
                + "            \"reg_date\": \"2020-10-08T12:42:58\"\n"
                + "        },\n"
                + "        \"purchase_by_w\": {\n"
                + "            \"age_band.0\": 6437,\n"
                + "            \"age_band.19\": 22537,\n"
                + "            \"age_band.24\": 19572,\n"
                + "            \"age_band.29\": 8506,\n"
                + "            \"age_band.34\": 5389,\n"
                + "            \"age_band.40\": 7068,\n"
                + "            \"gender.F\": 69509,\n"
                + "            \"gender.M\": 0,\n"
                + "            \"gender.N\": 0,\n"
                + "            \"total\": 69509,\n"
                + "            \"quantity\": 168743,\n"
                + "            \"reg_date\": \"2020-10-08T12:43:32\"\n"
                + "        }\n"
                + "    }\n"
                + "}";
            Object data = mapper.readValue(json,
                new TypeReference<BaseResponseV1<BrandStatResponseVO>>() {
                });

            System.out.println("data.toString() = " + data.toString());


        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
