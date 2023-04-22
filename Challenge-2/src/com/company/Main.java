package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // Long string input
        String paragraph = "Informatics is the future. It is a bridge to all things useful. Informatics harnesses " +
                "the power and possibility of digital technology to transform data and information into " +
                "knowledge that people use every day. This strong focus on the human use of computing helps " +
                "people to interact with technology in the best and most efficient way possible. Computer " +
                "scientists believe informatics is the human part of the IT equation, making computer software " +
                "and hardware relatable, accessible, and enjoyable to use.";

        // Split long string into array of words without punctuation
        String[] word = paragraph.split("\\W+");

        // Declare lists for words and count of words
        LinkedList<String> FC1 = new LinkedList<>();
        LinkedList<Integer> FC2 = new LinkedList<>();


        // Iterates through words in paragraph
        for (int i = 0; i < word.length; i++) {

            // Adds new words to FC1
            if (!FC1.contains(word[i].toLowerCase())) {

                // Word must have 3 or more characters to be added
                if (word[i].length() >= 3) {
                    FC1.add(word[i].toLowerCase());
                    FC2.add(1);
                }
            }

            // Adds 1 to the count of FC2 value if the character is already present
            else {
                FC2.set(FC1.indexOf(word[i].toLowerCase()), FC2.get(FC1.indexOf(word[i].toLowerCase())) + 1);
            }
        }

        // Prints the characters and number of times they occur
        for (int i = 0; i < FC1.size(); i++) {
            System.out.println(FC1.get(i) + " : " + FC2.get(i));
        }
    }
}
