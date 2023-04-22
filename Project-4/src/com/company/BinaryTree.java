package com.company;

public class BinaryTree {

    // Array declaration
    char[] arr = {'-','T','S','R','P','N','O','A','E','I','H','G','M'};

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
}
