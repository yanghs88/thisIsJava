package com.study.stat;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import java.io.IOException;
import java.lang.reflect.Field;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Converter {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = new DateTimeFormatterBuilder()
        .appendOptional(DateTimeFormatter.ISO_DATE_TIME)
        .appendOptional(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
        .appendOptional(DateTimeFormatter.ISO_INSTANT)
        .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SX"))
        .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssX"))
        .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
        .toFormatter()
        .withZone(ZoneOffset.UTC);

    public static OffsetDateTime parseDateTimeString(String str) {
        return ZonedDateTime.from(Converter.DATE_TIME_FORMATTER.parse(str)).toOffsetDateTime();
    }

    private static final DateTimeFormatter TIME_FORMATTER = new DateTimeFormatterBuilder()
        .appendOptional(DateTimeFormatter.ISO_TIME)
        .appendOptional(DateTimeFormatter.ISO_OFFSET_TIME)
        .parseDefaulting(ChronoField.YEAR, 2020)
        .parseDefaulting(ChronoField.MONTH_OF_YEAR, 1)
        .parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
        .toFormatter()
        .withZone(ZoneOffset.UTC);

    public static OffsetTime parseTimeString(String str) {
        return ZonedDateTime.from(Converter.TIME_FORMATTER.parse(str)).toOffsetDateTime().toOffsetTime();
    }
    // Serialize/deserialize helpers

    public static Response fromJsonString(String json) throws IOException {
        return getObjectReader().readValue(json);
    }

    public static String toJsonString(Response obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        reader = mapper.readerFor(Response.class);
        writer = mapper.writerFor(Response.class);
    }

    private static ObjectReader getObjectReader() {
        if (reader == null) instantiateMapper();
        return reader;
    }

    private static ObjectWriter getObjectWriter() {
        if (writer == null) instantiateMapper();
        return writer;
    }

    public static void main(String[] args) {

        String json = "{\n"
            + "    \"code\": \"OK\",\n"
            + "    \"message\": \"요청이 성공하였습니다.\",\n"
            + "    \"data\": {\n"
            + "        \"purchase\": {\n"
            + "            \"age_band.0\": 1,\n"
            + "            \"age_band.19\": 1,\n"
            + "            \"age_band.24\": 1,\n"
            + "            \"age_band.29\": 1,\n"
            + "            \"age_band.34\": 1,\n"
            + "            \"age_band.40\": 1,\n"
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

        try {

//            "18세 이하/19~23세/24~28세/29~33세/34~39세/40세 이상";
            Map<String, String> ageMap = new HashMap<>();
            Response response = fromJsonString(json);
            Data data = response.getData();
            Purchase purchase = data.getPurchase();

            Map<String, Long> findColumn = new HashMap<>();

//            Field[] fields = Purchase.class.getDeclaredFields();
//            Arrays.stream(fields)
//                .filter(field -> field.getName().contains("ageBand"))
//                .collect(Collectors.toList())
//                .forEach(field -> System.out.println("field = " + field));

            findColumn.put("ageBand0", purchase.getAgeBand0());
            findColumn.put("ageBand19", purchase.getAgeBand19());
            findColumn.put("ageBand24", purchase.getAgeBand24());
            findColumn.put("ageBand29", purchase.getAgeBand29());
            findColumn.put("ageBand34", purchase.getAgeBand34());
            findColumn.put("ageBand40", purchase.getAgeBand40());

            System.out.println("findColumn.toString() = " + findColumn.toString());

            String findMaxKey = Collections.max(findColumn.entrySet(), Map.Entry.comparingByValue()).getKey();

            System.out.println("findMaxKey = " + findMaxKey);
            System.out.println("findColumn.get(findMaxKey) = " + findColumn.get(findMaxKey));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
