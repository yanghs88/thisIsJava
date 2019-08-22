package com.study.chapter15.Question9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("blue", 96);
        map.put("red", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int minScore = 0;
        int totalScore = 0;
        int loopCnt = 0;

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for (Map.Entry<String, Integer> entry : entrySet) {
            if (loopCnt == 0) {
                minScore = entry.getValue();
            }
            if (entry.getValue() > maxScore) {
                maxScore = entry.getValue();
                name = entry.getKey();
            }
            if (entry.getValue() < minScore) {
                minScore = entry.getValue();
            }

            totalScore += entry.getValue();
            loopCnt++;
        }

        System.out.println("평균 점수 :" + (totalScore / entrySet.size()));
        System.out.println("최고 점수 :" + maxScore);
        System.out.println("최저 점수 :" + minScore);
        System.out.println("최고점수 받은 아이디 :" + name);

    }
}
