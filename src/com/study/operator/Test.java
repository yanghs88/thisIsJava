package com.study.operator;

public class Test {

    public static void main(String[] args) {
        
        int brands = 5682;
        int chunkSize = 1000;
        int ceil =(int) Math.ceil(brands / chunkSize);

        System.out.println("ceil = " + ceil);

    }
}
