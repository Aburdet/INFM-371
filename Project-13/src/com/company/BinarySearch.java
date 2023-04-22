package com.company;

import java.util.Arrays;

public class BinarySearch {

    int[] BSubArray (int[] arr, int s) {
        int[] arrClone = arr.clone();
        if (arrClone.length % 2 != 0) {
            int l = arrClone.length;
            int r;
            while (arrClone.length > 1) {
                if (s > arrClone[l/2]) {
                    r = l-1;
                    l = (l/2)+1;
                    arrClone = ArraySlice(arrClone,l,r);
                }
                else if (s < arrClone[l/2]){
                    l = 0;
                    r = (arrClone.length/2)-1;
                    arrClone = ArraySlice(arrClone,l,r);
                }
                else if (arrClone[l/2] == s) {
                    arrClone = ArraySlice(arrClone,l/2,l/2);
                }
                l = arrClone.length;
                System.out.println(Arrays.toString(arrClone));
            }
        }
        else {
            int l = arrClone.length;
            int r;
            while (arrClone.length > 2) {
                if (s > arrClone[(l/2)]) {
                    r = l-1;
                    l = (l/2)+1;
                }
                else {
                    r = l/2;
                    l = 0;
                }
                arrClone = ArraySlice(arrClone, l, r);
                l = arrClone.length;
                System.out.println(Arrays.toString(arrClone));
            }
            if (s > arrClone[0]) {
                arrClone = ArraySlice(arrClone, 1, 1);
                System.out.println(Arrays.toString(arrClone));
            }
            else {
                arrClone = ArraySlice(arrClone, 0, 0);
                System.out.println(Arrays.toString(arrClone));
            }
        }
        return arrClone;
    }


    int[] ArraySlice(int[] arr, int l, int r) {
        int[] arrClone = new int[(r-l)+1];
        for (int i=0; i < arrClone.length; i++) {
            arrClone[i] = arr[i+l];
        }
        return arrClone;
    }
}
