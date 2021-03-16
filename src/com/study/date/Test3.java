package com.study.date;

import java.time.LocalDateTime;

public class Test3 {

    public static void main(String[] args) {
        System.out.println("now = " + DateUtil.now().toString());

        LocalDateTime commentDate = LocalDateTime.of(2020, 12, 2, 12,0,0);

        LocalDateTime commentAddDate = commentDate.plusHours(48);
        System.out.println("commentAddDate = " + commentAddDate.toString());

        boolean after = commentAddDate.isAfter(DateUtil.now());

        System.out.println("after = " + after);


        String date = "2020120724";

        char[] chars = date.toCharArray();
        System.out.println("chars[8] = " + chars[8]);
        System.out.println("chars[9] = " + chars[9]);

        chars[9] = 3;

        String tt = new String(chars);

        System.out.println("tt = " + tt);

    }
}
