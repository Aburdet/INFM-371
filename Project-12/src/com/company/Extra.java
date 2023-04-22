package com.company;

import java.util.Arrays;

public class Extra {

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

    void search(int[] arr, int key) {
        int[] arrClone = arr.clone();
        int l = 0;
        int r = arr.length-1;
        while (l<=r) {
            int m = (l+r)/2;
            if (key < arr[m]) {
                arrClone = ArraySlice(arrClone,l,r);
                r = m-1;
            }
            else if (key > arr[m]) {
                arrClone = ArraySlice(arrClone,l,r);
                l = m+1;
            }
            else {
                arrClone = ArraySlice(arrClone,l,r);
                System.out.println(Arrays.toString(arrClone));
                System.out.println("Value: " + arr[m]);
                break;
            }
            System.out.println(Arrays.toString(arrClone));
        }
    }
}
