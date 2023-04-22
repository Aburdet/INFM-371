package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class Main {

    // Declare initial lists
    static LinkedList<Integer> II = new LinkedList<>(){
        {
            add(1);
            add(6);
            add(5);
            add(10);
            add(15);
            add(3);
            add(20);
            add(7);
            add(17);
            add(13);
            add(13);
            add(4);
            add(18);
            add(13);
            add(17);
            add(19);
            add(19);
            add(15);
            add(13);
            add(1000);
        }
    };

    // Finds floor of key in list
    static void floor(int key) {
        int i = 0;
        while ((i < II.size()) && (II.get(i) <= key)) {
            i++;
        }
        i--;
        System.out.println("Floor: " + II.get(i));
    }

    // Finds ceiling of key in list
    static void ceiling(int key) {
        int i = 0;
        while ((i < II.size()-1) && (II.get(i) <= key)) {
            i++;
        }
        System.out.println("Ceiling: " + II.get(i));
    }

    public static void main(String[] args) {
        System.out.println(II);
        Collections.sort(II);
        System.out.println(II);
        floor(13);
        ceiling(13);
    }
}
