package com.company;

import java.util.Arrays;

public class Main {

    // Declares matrix
    static String[][] arr = {
            {"6","2","12"},
            {"20",null,"28"},
            {"28","26",null},
            {"16","6","20"},
            {"12","8","14"}
    };

    // Finds the root node of the BST
    static void findRoot() {
        outer:for (int i=0; i < arr.length; i++) {

            // Set the node to be checked
            String node = arr[i][0];
            int index = 0;
            for (int j = 0; j < arr.length; j++) {

                // If the node is a child of any other node, it is not the root
                if (node.equals(arr[index][1]) || node.equals(arr[index][2])) {
                    break;
                }
                else {
                    index++;
                }

                // If the index is the length of the matrix, no matches were found and this is the root node
                if (index == arr.length) {
                    System.out.println(node);
                    break outer;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(arr));
        findRoot();
    }
}
