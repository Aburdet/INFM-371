package com.company;

import java.util.ArrayList;

public class MaxPQ {

    ArrayList<Character> pq = new ArrayList<>();

    void insert(Character v) {
        pq.add(v);
    }

    void content() {
        System.out.println(pq);
    }
}
