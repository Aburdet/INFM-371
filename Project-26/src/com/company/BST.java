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
    boolean search(int num, Node node) {

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
            return search(num, node.right);
        }
        // If the number is less than the current node value, go left
        else {
            return search(num, node.left);
        }
    }

    // Figures out how many children a node has and returns a case value (1 = None, 2 = One, 3 = Two)
    int Case(Node node){

        // No children
        if (node.left == null && node.right == null) {
            return 1;
        }
        // One child
        else if (node.left == null ^ node.right == null) {
            if (node.right == null) {
                return 21;
            }
            else {
                return 22;
            }
        }
        // Two children
        else {
            return 3;
        }
    }

    // Delete a node
    Node delete(int data, Node node) {

        // Go right
        if (data > node.data) {
            node.right = delete(data, node.right);
        }
        // Go left
        else if (data < node.data) {
            node.left = delete(data, node.left);
        }
        // Delete node based on case
        else {
            // Case 1 deletion
            if (Case(node) == 1) {
                node = null;
            }
            // Case 2 deletion
            else if (Case(node) == 21 || Case(node) == 22) {
                // Left child
                if (Case(node) == 21) {
                    node = node.left;
                }
                // Right child
                else {
                    node = node.right;
                }
            }
            // Case 3 deletion
            else {
                // Swap with minimum right child
                node.data = minChild(node);
                // Delete child that was swapped
                delete(node.data, node.right);
            }
        }
        return node;
    }

    // Finds minimum child of right subtree
    int minChild(Node node) {
        node = node.right;
        int min = node.data;
        while (node.left != null) {
            node = node.left;
            min = node.data;
        }
        return min;
    }

    // Finds maximum child of left subtree
    int maxChild(Node node) {
        node = node.left;
        int max = node.data;
        while (node.right != null) {
            node = node.right;
            max = node.data;
        }
        return max;
    }
}
