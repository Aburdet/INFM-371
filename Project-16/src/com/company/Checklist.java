package com.company;

import java.util.Arrays;
import java.util.Random;

public class Checklist {

    static int[] arr = new int[100000000];

    static void remove(int num) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                arr[i] = 0;
                break;
            }
        }
        for (i = i+1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[i-1] = 0;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        remove(arr[3]);
    }
}
