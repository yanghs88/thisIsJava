package com.study.str;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Encode {

    public static void main(String[] args){

        String enStr = "";
        String test = null;

        try {
            enStr = URLEncoder.encode(test, "UTF-8");

        } catch (UnsupportedEncodingException e) {
            System.out.println("error ===================== " + e);
            e.printStackTrace();
        }
        finally {
            System.out.println("test = " + test);
        }

        //String deStr = URLDecoder.decode(enStr, "UTF-8");

        System.out.println("enStr = " + enStr);
//        System.out.println("deStr = " + deStr);
    }
}
