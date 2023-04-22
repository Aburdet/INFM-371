package com.company;

import java.util.ArrayList;

public class MaxPQ {

    ArrayList<Character> pq = new ArrayList<>();

    // Insert entity into the queue
    void insert(Character v) {
        pq.add(v);
    }

    // Display contents of the queue
    void content() {
        System.out.println(pq);
    }

    // Returns max value in the queue
    char max() {
        char max = pq.get(0);
        for (int i=1; i < pq.size(); i++) {
            if (pq.get(i).compareTo(max) > 0) {
                max = pq.get(i);
            }
        }
        System.out.println("Max value: " + max);
        return max;
    }

    // Deletes max value in the queue
    char delMax() {
        char max = pq.get(0);
        int maxIndex = 0;
        for (int i=0; i < pq.size(); i++) {
            if (pq.get(i).compareTo(max) > 0) {
                max = pq.get(i);
                maxIndex = i;
            }
        }
        pq.remove(maxIndex);
        System.out.println("Removed " + max + " from the queue.");
        return max;
    }
}
