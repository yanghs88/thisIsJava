package com.study.str;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class JacosonTest {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            String jsonInString = "{\"name\":\"JSON\",\"age\":10,\"messages\":[\"JSON은 자바스크립트를 확장하여 만들어졌습니다.\",\"JSON은 자바스크립트 객체 표기법을 따릅니다.\",\"JSON은 사람과 기계가 모두 읽기 편하도록 고안되었습니다.\",\"JSON은 프로그래밍 언어와 운영체제에 독립적입니다.\"]}";
            // JSON 타입의 String을 객체로 변환
            User user02 = mapper.readValue(jsonInString, User.class);
            System.out.println(user02);


            String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
            Car car = mapper.readValue(json, Car.class);

            System.out.println(car);




        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
