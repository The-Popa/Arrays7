package com.Popa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Odd numbers: ");

        for (int value : array) {
            if (value % 2 != 0) {

                System.out.println(value);
            }
        }
    }
}




