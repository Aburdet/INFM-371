package com.company;

public class BST {

    // Creates new node
    Node newNode(int num) {
        Node node = new Node();
        node.data = num;
        return node;
    }

    // Insert node into BST
    Node insert(int value, Node node) {

        // If the node is null, insert new node
        if (node == null) {
            node = newNode(value);
        }
        // If value is greater than current node, go right
        else if (value > node.data) {
            node.right = insert(value, node.right);
        }
        // If value is less than current node, go left
        else {
            node.left = insert(value, node.left);
        }
        return node;
    }
}
