package test;

import java.util.Scanner;

public class SplitStringExam1 {

    public static void main(String[] args) {

//        String str = "Javatpoint is the best website to learn new technologies";
//        Scanner sc = new Scanner(str);
//        while (sc.hasNext()) {
//            String token = sc.next();
//            System.out.println(token);
//        }
//        sc.close();

        String str = "Welcome,to,the,world,of,tech";
        String[] tokens = str.split(",");

        for (String token : tokens) {
            System.out.println(token);
        }

    }
}
