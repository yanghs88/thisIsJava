package com.study.str;

public class Test {

    public static void main(String[] args) {

        String img = "/images/goods_img/20200603/1473133/1473133_3_500.jpg";
        String[] image = img.split("\\.");
        String extention = image[image.length - 1];

        System.out.println("img = " + img);
        int i = img.indexOf(".");
        System.out.println("i = " + i);

    }
}
