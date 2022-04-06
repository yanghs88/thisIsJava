package test;

public class SplitStringExample3 {

    public static void main(String[] args) {

//        String s = "If you don't like something, change.it.";
//
//        String[] tokens = s.split("[,.']]+");
//
//        for (int i = 0; i<tokens.length; i++) {
//            System.out.println(tokens[i]);
//        }

        //defining a String object
        String s = "If you don't like something, change.it.";
        String[] stringarray = s.split("[, . ']+");
        for (int i = 0; i < stringarray.length; i++) {
            System.out.println(stringarray[i]);
        }
    }
}
