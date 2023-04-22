package com.company;

import java.util.Arrays;

import static java.lang.Math.round;

public class BinaryTree {

    // Array declaration
    char[] arr = {'-','T','H','R','P','S','O','A','E','I','N','G'};

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
    void iSwim() {
        System.out.println(Arrays.toString(arr));
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > arr[i/2]) {
                while (arr[i] > arr[i/2]) {
                    exchSwim(i);
                    i = i/2;
                    if (i < 2) {
                        i = 2;
                    }
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
    }

    // Swaps values at given index
    private void exchSwim(int key) {
        char temp = arr[key];
        arr[key] = arr[key/2];
        arr[key/2] = temp;
    }

    // Checks if node is on bottom level
    boolean isBt(int key) {
        return (key*2) > (arr.length-1);
    }

    // Sorts nodes that are smaller than their children
    void iSink() {
        System.out.println(Arrays.toString(arr));
        for(int i=1; i < (int) round((double)arr.length/2); i++) {

            // Checks left child
            if (arr[i] < arr[i*2]) {
                int temp = i;
                while (arr[i] < arr[i*2]) {
                    exchSink1(i);
                    if (i*2 < arr.length/2) {
                        i = i*2;
                    }
                    System.out.println(Arrays.toString(arr));
                }
                i = temp;
            }

            // Checks right child
            else if (arr[i] < arr[(i*2)+1]) {
                int temp = i;
                while (arr[i] < arr[(i*2)+1]) {
                    exchSink2(i);
                    if ((i*2)+1 < arr.length/2) {
                        i = (i*2)+1;
                    }
                    System.out.println(Arrays.toString(arr));
                }
                i = temp;
            }
        }
    }

    // Exchanges left child with parent
    private void exchSink1(int key) {
        char temp = arr[key];
        arr[key] = arr[key*2];
        arr[key*2] = temp;
    }

    // Exchanges right child with parent
    private void exchSink2(int key) {
        char temp = arr[key];
        arr[key] = arr[(key*2)+1];
        arr[(key*2)+1] = temp;
    }
}
