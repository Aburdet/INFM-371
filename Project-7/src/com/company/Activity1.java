package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class Activity1 {

    public static void main(String[] args) {

        // Initialize list
        LinkedList<String> mis = new LinkedList<>();
        mis.add("1");
        mis.add("2");
        mis.add("3");
        mis.add("4");
        mis.add("5");

        // Variables
        String str = mis.toString();
        Object[] arr = mis.toArray();

        // Print
        System.out.println(mis.indexOf("3"));
        System.out.println(mis.peek());
        System.out.println(str);
        System.out.println(mis);
        System.out.println(Arrays.toString(arr));
    }
}
