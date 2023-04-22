package com.company;

import java.util.LinkedList;

public class Phonebook {

    // Declare initial lists of names and numbers
    LinkedList<String> name = new LinkedList<>() {
        {
            add("John");
            add("Mary");
            add("Nili");
        }
    };
    LinkedList<String> number = new LinkedList<>() {
        {
            add("2055835874");
            add("5182768940");
            add("5863243019");
        }
    };

    // Prints all contacts in phonebook
    void print() {
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i) + " : " + number.get(i));
        }
    }

    // Adds contact to phonebook in alphabetical order
    void add(String name1, String number1) {
        int i = 0;
        while ((i < name.size()) && (name1.compareToIgnoreCase(name.get(i)) > 0)) {
            i++;
        }
        name.add(i, name1);
        number.add(i, number1);
    }

    // Deletes contact from phonebook
    void delete(String S) {
        if (name.contains(S)) {
            int i = name.indexOf(S);
            name.remove(i);
            number.remove(i);
            System.out.println("The contact information of " + S + " has been deleted.");
        }
    }

    // Searches phonebook for name or number
    void search(String S) {
        if (name.contains(S)) {
            int i = name.indexOf(S);
            System.out.println("The number of " + S + " is " + number.get(i) + ".");
        }
        else {
            int i = number.indexOf(S);
            System.out.println("The owner of " + S + " is " + name.get(i) + ".");
        }
    }
}
