package com.study.chapter5;

import java.util.Calendar;

public class EnumWeekExample {

    public static void main(String[] args) {

        Week today = null;

        Calendar calendar = Calendar.getInstance();

        int week = calendar.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1:
                today = Week.MONDAY;
                break;
            case 2:
                today = Week.TUESDAY;
                break;
            case 3:
                today = Week.WEDNEDAY;
                break;
            case 4:
                today = Week.THURDAY;
                break;
            case 5:
                today = Week.FRIDAY;
                break;
            case 6:
                today = Week.SATURDAY;
                break;
            case 7:
                today = Week.SUNDAY;
                break;

        }

        System.out.println("today name = " + today.name());
        System.out.println("today ordinal = " + today.ordinal());


        //외부로 문자열 입력받아 열거 객체로 변환할때 유용하게 사용.
        Week weekday = Week.valueOf("FRIDAY");
        System.out.println("weekday = " + weekday.name());


        Week[] weeks = Week.values();

        for (Week day : weeks) {
            System.out.println("day = " + day);
        }

    }
}
