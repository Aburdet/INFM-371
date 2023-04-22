package com.company;

import java.util.Arrays;

public class Main {

    static int[] arr = {0,2,3,4,10,40,44};

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arrClone = bs.ArraySlice(arr,2,5);
        System.out.println(Arrays.toString(arrClone));

        Extra ex = new Extra();
        ex.search(arr,3);
    }
}
