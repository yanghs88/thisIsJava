package com.study.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSliceTest {

    public static void main(String[] args) {
        try {

            // Creating object of ArrayList<Integer>
            ArrayList<String>
                arrlist = new ArrayList<String>();

            // Populating arrlist1
            arrlist.add("A");
            arrlist.add("B");
            arrlist.add("C");
            arrlist.add("D");
            arrlist.add("E");

            // print arrlist
            System.out.println("Original arrlist: "
                + arrlist);

            // getting the subList
            // using subList() method
            List<String> arrlist2 = arrlist.subList(0, 2);

            // print the subList
            System.out.println("Sublist of arrlist: "
                + arrlist2);

            List<String> arrlist3 = arrlist.subList(2, arrlist.size());

            System.out.println("arrlist3 = " + arrlist3);
        }

        catch (IndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("Exception thrown : " + e);
        }
    }

}
