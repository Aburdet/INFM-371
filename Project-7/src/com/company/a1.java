package com.company;

import java.util.LinkedList;

public class a1 {

    public static void main(String[] args) {
        LinkedList<String> mis = new LinkedList<>();
        mis.add("A");
        mis.add("B");
        mis.addLast("C");
        mis.addFirst("D");
        mis.add(2, "E");
        System.out.println(mis);
        mis.remove("B");
        mis.remove(3);
        mis.removeFirst();
        mis.removeLast();
        System.out.println(mis);
    }
}
