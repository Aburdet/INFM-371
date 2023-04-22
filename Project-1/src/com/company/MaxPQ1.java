package com.company;

public class MaxPQ1 {

    char[] pq = new char[4];

    void insert(int index, char v) {
        pq[index] = v;
    }

    void content() {
        System.out.println(pq);
    }
}
