package com.company;

public class Main {

    public static void main(String[] args) {

        Phonebook pb = new Phonebook();
        pb.add("Tony","3137435067");
        pb.add("George","2075634234");
        pb.add("Nili","2053448926");
        pb.add("Linda","5922511004");
        pb.add("Zanyar","2056729048");
        pb.print();
        System.out.println("--------------------");
        pb.delete("Tony");
        pb.print();
    }
}
