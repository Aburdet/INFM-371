package com.company;

public class Main {

    public static void main(String[] args) {

        // Root node 0 (16)
        Node node0 = new Node();
        node0.data = 16;

        // Left child of node 0 (16)
        Node node1=new Node();
        node1.data = 6;
        node0.left = node1;

        // Right child of node 0 (16)
        Node node2 = new Node();
        node2.data = 20;
        node0.right = node2;

        // Left child of node 1 (6)
        Node node3 = new Node();
        node3.data = 2;
        node1.left = node3;

        // Right child of node 1 (6)
        Node node4 = new Node();
        node4.data = 12;
        node1.right = node4;

        // Right child of node 2 (20)
        Node node5 = new Node();
        node5.data = 28;
        node2.right = node5;

        // Left child of node 4 (12)
        Node node6 = new Node();
        node6.data = 8;
        node4.left = node6;

        // Right child of node 4 (12)
        Node node7 = new Node();
        node7.data = 14;
        node4.right = node7;

        // Left child of node 5 (28)
        Node node8 = new Node();
        node8.data = 26;
        node5.left = node8;

        // Follow tree to node 8 (left child of node 5 (28))
        System.out.println(node0.right.right.left.data);

        // Follow tree to node 6 (left child of node 4 (12))
        System.out.println(node0.left.right.left.data);
    }
}
