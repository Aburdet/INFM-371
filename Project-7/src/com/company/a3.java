package com.company;

import java.util.LinkedList;

public class a3 {

    public static void main(String[] args) {
        LinkedList<String> mis = new LinkedList<>();
        mis.add("A");
        mis.add("B");
        mis.add(1, "X");
        for (int i = 0; i < mis.size(); i++) {
            System.out.print(mis.get(i) + " ");
        }
        System.out.println();
        for (String str : mis) {
            System.out.print(str + " ");
        }
    }
}
