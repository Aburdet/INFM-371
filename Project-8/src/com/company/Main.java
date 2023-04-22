package com.company;

public class Main {

    public static void main(String[] args) {

        Phonebook book = new Phonebook();
        book.add("Adam","2051231234");
        book.print();
        book.delete("Nili");
        book.print();
        book.search("John");
        book.search("2051231234");
    }
}
