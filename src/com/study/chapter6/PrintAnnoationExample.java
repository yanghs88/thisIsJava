package com.study.chapter6;

import java.lang.reflect.Method;

public class PrintAnnoationExample {

    public static void main(String[] args) {
        Method[] declareMethods = Service.class.getDeclaredMethods();

        for (Method method : declareMethods) {
            //PrintAnnoation 클래스가 적용되었는지 확인
            if (method.isAnnotationPresent(PrintAnnoation.class)) {

                PrintAnnoation printAnnoation = method.getAnnotation(PrintAnnoation.class);


                System.out.println("[" + method.getName() + "]");
                for (int i = 0; i < printAnnoation.number(); i++) {
                    System.out.print(printAnnoation.value());
                }
                System.out.println();


                try {
                    method.invoke(new Service());
                } catch (Exception e) {

                }

                System.out.println();
                System.out.println();
            }
        }
    }
}
