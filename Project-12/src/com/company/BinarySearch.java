package com.company;

public class BinarySearch {

    int[] ArraySlice(int[] arr, int l, int r) {
        int[] arrClone = new int[(r-l)+1];
        int i = 0;
        while (l <= r) {
            arrClone[i] = arr[l];
            i++;
            l++;
        }
        return arrClone;
    }
}
