package test;

import java.util.Scanner;

public class Ascii_Change {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char alpha = sc.nextLine().charAt(0);
        int ialpha = (int) alpha;

        final boolean result = isDisplayASCIICode(alpha);

        System.out.println("code= " + ialpha + " isDisplay = " + result);

    }

    public static boolean isDisplayASCIICode(char findChar) {
        //32 ~ 126
        int ascCode = (int) findChar;
        return ascCode >= 32 && ascCode <= 126;
    }

}
