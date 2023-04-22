package com.company;

public class Extra {

    BST bst = new BST();

    Node delete(int data, Node node) {
        if (node == null) {
            return node;
        }
        else if (data > node.data) {
            return node.right = delete(data, node.right);
        }
        else if (data < node.data) {
            return node.left = delete(data, node.left);
        }
        else {
            if (bst.Case(node) == 1) {
                node = null;
            }
            return node;
        }
    }
}
