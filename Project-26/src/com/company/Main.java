package com.company;

public class Main {

    public static void main(String[] args) {

        BST bst = new BST();

        // Establishes root node of the BST
        Node root = bst.insert(16, null);
        // BST nodes
        bst.insert(6, root);
        bst.insert(20, root);
        bst.insert(2, root);
        bst.insert(12, root);
        bst.insert(28, root);
        bst.insert(1, root);
        bst.insert(5, root);
        bst.insert(8, root);
        bst.insert(14, root);
        bst.insert(26, root);
        bst.insert(7, root);
        bst.insert(9, root);
        bst.insert(13, root);
        bst.insert(15, root);

        // Right child of node 6
        System.out.println(root.left.right.data);
        // Left child of node 14
        System.out.println(root.left.right.right.left.data);
        // Search for node 12
        System.out.println(bst.search(12, root));
        // Delete node 12
        bst.delete(12, root);
        // Search for node 12
        System.out.println(bst.search(12, root));
        // Right child of node 6
        System.out.println(root.left.right.data);
        // Left child of node 14
        System.out.println(root.left.right.right.left);
    }
}
