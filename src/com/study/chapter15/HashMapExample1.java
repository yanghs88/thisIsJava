package com.study.chapter15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("test1", 90);
        map.put("test2", 80);
        map.put("test3", 70);
        map.put("test4", 60);

        System.out.println("총 Entry 수 : " + map.size());
        System.out.println("\tfind [test1] : " + map.get("test5"));

        Set<String> keySet = map.keySet();
        Iterator<String> keyIiterator = keySet.iterator();

        while (keyIiterator.hasNext())
        {
            String key = keyIiterator.next();
            Integer value = map.get(key);

            System.out.println("\t" + key + " : " + value);
        }

        //객체 삭제
        map.remove("test2");
        System.out.println("총 Entry 수 : " + map.size());

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext())
        {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }

        map.clear();
        System.out.println("총 Entry 수 : " + map.size());
    }
}
