package com.study.chapter5;

public class MainStringArrayArgument {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("프로그램의 사용 법");
            System.out.println("Java MainStringArrayArgument num1 num2");
            System.exit(0);
        }

        String strNum1 = args[0];
        String strNum2 = args[1];


        System.out.println("strNum1 = " + strNum1);
        System.out.println("strNum2 = " + strNum2);
    }
}
