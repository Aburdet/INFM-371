package com.company;

public class Main {

    static int[] arr = {0,2,3,4,10,40,44};

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        boolean F = bs.FindS(arr, 4);
        System.out.println(F);
    }
}
