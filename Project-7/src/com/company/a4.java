package com.company;

import java.util.LinkedList;

public class a4 {

    public static void main(String[] args) {
        LinkedList<String> mis = new LinkedList<>();
        mis.add("Informatics");
        mis.add("for");
        mis.add("Computer");
        mis.add("10");
        mis.add("20");
        System.out.println(mis);
        System.out.println(mis.contains("Hello"));
        System.out.println(mis.contains("20"));
    }
}
