package com.company;

import java.util.LinkedList;

public class a2 {

    public static void main(String[] args) {
        LinkedList<String> mis = new LinkedList<>();
        mis.add("A");
        mis.add("B");
        mis.add(1, "C");
        System.out.println(mis);
        mis.set(1, "X");
        System.out.println(mis);
    }
}
