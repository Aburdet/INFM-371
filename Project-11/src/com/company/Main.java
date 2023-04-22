package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.nextLine();
        LinkedList<Character> FC1 = new LinkedList<>();
        LinkedList<Integer> FC2 = new LinkedList<>();

        // Iterates through characters in word
        for (int i = 0; i < word.length(); i++) {

            // Adds new letters to FC1
            if (!FC1.contains(word.charAt(i))) {
                FC1.add(word.charAt(i));
                FC2.add(1);
            }

            // Adds 1 to the count of FC2 value if the character is already present
            else {
                FC2.set(FC1.indexOf(word.charAt(i)), FC2.get(FC1.indexOf(word.charAt(i)))+1);
            }
        }

        // Prints the characters and number of times they occur
        for (int i = 0; i < FC1.size(); i++) {
            System.out.println(FC1.get(i) + " : " + FC2.get(i));
        }
    }
}
