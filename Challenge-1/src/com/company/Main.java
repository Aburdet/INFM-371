package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        // Declare variables for individual spaces
        int total = 100;
        int x11 = total - rand.nextInt(total);
        int x12 = total - rand.nextInt(total);
        int x21 = total - rand.nextInt(total);
        int x22 = total - rand.nextInt(total);

        // Declare totals for sums (horizontal (y) and vertical (z))
        int y1 = x11 + x12;
        int y2 = x21 + x22;
        int z1 = x11 + x21;
        int z2 = x12 + x22;

        // While variables don't add to 100 on X or Y axis, re-roll
        while (y1 + y2 != 100 && z1 + z2 != 100) {
            x11 = total - rand.nextInt(total);
            x12 = total - rand.nextInt(total);
            x21 = total - rand.nextInt(total);
            x22 = total - rand.nextInt(total);
            y1 = x11 + x12;
            y2 = x21 + x22;
            z1 = x11 + x21;
            z2 = x12 + x22;
        }

        // Print values
        System.out.println(x11 + "  " + x12 + " | " + y1);
        System.out.println(x21 + "  " + x22 + " | " + y2);
        System.out.println("--------");
        System.out.print(z1 + "  " + z2);
    }
}
