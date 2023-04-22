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

    // Searches BST for a node with the given value
    boolean search(Node node, int num) {

        // If the node doesn't exist, return false
        if (node == null) {
            return false;
        }
        // If the node is equal to the value, return true
        else if (num == node.data) {
            return true;
        }
        // If the number is greater than the current node value, go right
        else if (num > node.data) {
            return search(node.right, num);
        }
        // If the number is less than the current node value, go left
        else {
            return search(node.left, num);
        }
    }
}
