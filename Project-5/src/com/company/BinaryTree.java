package com.company;

import java.util.Arrays;

public class BinaryTree {

    // Array declaration
    char[] arr = {'-','S','P','R','N','T','O','A','E','I','H','G'};

    // Gets index and parent value
    void getIndex(char key) {
        for (int i=1; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("The index is: " + i);

                // Checks for index's parent
                if (i == 1) {
                    System.out.println("This node does not have a parent!");
                }
                else {
                    char parent = arr[i/2];
                    System.out.println("The parent is: " + parent);
                }
                break;
            }
        }
    }

    // Get number and value of children of specified node
    void getChild(char key) {
        for (int i=1; i < arr.length; i++) {
            if (arr[i] == key) {

                // Checks if node has 0, 1, or 2 children
                if((i*2) > arr.length-1) {
                    System.out.println("Node has no children");
                }
                else if (((i*2)+1) > arr.length-1) {
                    System.out.println("Node has one child: " + arr[i*2]);
                }
                else if (((i*2)+1) <= arr.length-1) {
                    System.out.println("Node has two children: " + arr[i*2] + " and " + arr[(i*2)+1]);
                }
                break;
            }
        }
    }

    // Sorts from largest to smallest for a given index
    void iSwim(int key) {
        boolean swim = arr[key] > arr[key/2];
        System.out.println(Arrays.toString(arr));
        if (arr[key] > arr[key/2]) {
            while (arr[key] > arr[key/2]) {
                exch(key);
                key = key/2;
                if (key < 2) {
                    key = 2;
                }
            }
            System.out.println(swim);
            System.out.println(Arrays.toString(arr));
        }
        else {
            System.out.println(swim);
        }
    }

    // Swaps values at given index
    private void exch(int key) {
        char temp = arr[key];
        arr[key] = arr[key/2];
        arr[key/2] = temp;
    }
}
