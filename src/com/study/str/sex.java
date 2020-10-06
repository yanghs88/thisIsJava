package com.study.str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sex {

    public static void main(String[] args) {

        int[] values = {0,6,5,11,15,2,9,7,3,1};
        int[] genders = {1,2,4,8};
        Map<String, List<Integer>> findGender = new HashMap<>();
        for (int db : values) {
            List<Integer> box = new ArrayList<>();
            for (int gender : genders) {
                if (isBN(db, gender)) {
                    box.add(gender);
                }
                findGender.put(Integer.toString(db), box);
            }
        }
        System.out.println("findGender = " + findGender);





        System.out.println(isBN(0,2));
        System.out.println(isBN(6,4));
        System.out.println(isBN(5,6));
        System.out.println(isBN(15,8));

//        int temp = 10 % 3;
//        System.out.println("temp = " + temp);
        
    }

    public static boolean isBN(int n , int c) {

        int d = n % (c*2);
        boolean result = (d>=c);
        return result;
    }
}
