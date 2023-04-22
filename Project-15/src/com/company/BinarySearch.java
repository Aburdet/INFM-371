package com.company;

import java.util.Arrays;

public class BinarySearch {

    // Checks array to see if it contains the value input
    boolean BS(int[] arr, int s) {
        while(arr.length > 1) {
            if (FindS(arr,s)) {
                return true;
            }
            else {
                arr = BSubArray(arr, s);
            }
        }
        return s == arr[0];
    }

    // Check to see if middle is equal to the input value
    boolean FindS(int[] arr, int s) {
        int l = arr.length;
        if (l % 2 != 0){
            return s == arr[l/2];
        }
        else{
            return s == arr[(l/2)-1];
        }
    }

    // Make sub array from existing array
    int[] BSubArray (int[] arr, int s) {
        int l = arr.length;
        if (arr.length % 2 != 0) {
            int r;
            while (arr.length > 1) {
                if (s > arr[l/2]) {
                    r = l-1;
                    l = (l/2)+1;
                    arr = ArraySlice(arr,l,r);
                }
                else if (s < arr[l/2]){
                    l = 0;
                    r = (arr.length/2)-1;
                    arr = ArraySlice(arr,l,r);
                }
                else if (arr[l/2] == s) {
                    arr = ArraySlice(arr,l/2,l/2);
                }
                l = arr.length;
                System.out.println(Arrays.toString(arr));
            }
        }
        else {
            int r;
            while (arr.length > 2) {
                if (s > arr[(l/2)]) {
                    r = l-1;
                    l = (l/2)+1;
                }
                else {
                    r = l/2;
                    l = 0;
                }
                arr = ArraySlice(arr, l, r);
                l = arr.length;
                System.out.println(Arrays.toString(arr));
            }
            if (s > arr[0]) {
                arr = ArraySlice(arr, 1, 1);
                System.out.println(Arrays.toString(arr));
            }
            else {
                arr = ArraySlice(arr, 0, 0);
                System.out.println(Arrays.toString(arr));
            }
        }
        return arr;
    }

    // Slice array in half and return sliced array
    int[] ArraySlice(int[] arr, int l, int r) {
        int[] arrClone = new int[(r-l)+1];
        for (int i=0; i < arrClone.length; i++) {
            arrClone[i] = arr[i+l];
        }
        return arrClone;
    }
}
