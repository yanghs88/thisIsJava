package com.study.chapter17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class MultiSortExample {

    public static void main(String[] args) {

        List<Integer> origin = Arrays.asList(1,2,3,4,5);

        ArrayList<Product> products = new ArrayList<>();
        
        for (int i=5; i>=1; i--) {
            //int randomValue = (int) (Math.random() * 10 +1);
            Product product = new Product(i, "product" + i);
            products.add(product);
            System.out.println("product = " + product.toString());
        }



    }
}
