package com.company;

public class BinaryTree {

    // Array declaration
    char[] arr = {'-','T','S','R','P','N','O','A','E','I','H','G'};

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
}
