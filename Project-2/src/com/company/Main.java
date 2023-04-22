package com.company;

public class Main {

    public static void main(String[] args) {
	    MaxPQ pq = new MaxPQ();
        pq.insert('P');
        pq.content();
        pq.insert('Q');
        pq.content();
        pq.insert('E');
        pq.content();
        pq.delMax();
        pq.content();
        pq.insert('X');
        pq.content();
        pq.insert('A');
        pq.content();
        pq.insert('M');
        pq.content();
        pq.delMax();
        pq.content();
        pq.insert('P');
        pq.content();
        pq.insert('L');
        pq.content();
        pq.insert('E');
        pq.content();
        pq.delMax();
        pq.content();
    }
}
