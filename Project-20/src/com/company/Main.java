package com.company;

public class Main {

    public static void main(String[] args) {

        BST bst = new BST();

        // Establishes root node of the BST
        Node root = bst.insert(16, null);
        bst.insert(6, root);
        bst.insert(20, root);
        bst.insert(2, root);

        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
        System.out.println(root.left.left.data);
    }
}
