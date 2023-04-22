package com.company;

public class Main {

    public static void main(String[] args) {
	    MaxPQ pq = new MaxPQ();
        MaxPQ1 pq1 = new MaxPQ1();
        pq.insert('A');
        pq.insert('H');
        pq.insert('W');
        pq.insert('M');
        pq.content();
        pq1.insert(0,'A');
        pq1.insert(1,'H');
        pq1.insert(2,'W');
        pq1.insert(3,'M');
        pq1.content();
    }
}
