package com.company;

public class Main {

    public static void main(String[] args) {

        BST bst = new BST();

        // Establishes root node of the BST
        Node root = bst.insert(16, null);
        bst.insert(6, root);
        bst.insert(20, root);
        bst.insert(2, root);
        bst.insert(12, root);
        bst.insert(28, root);
        bst.insert(8, root);
        bst.insert(14, root);
        bst.insert(26, root);

        System.out.println(bst.Case(root.right.right.left));
    }
}
