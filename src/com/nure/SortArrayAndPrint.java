package com.nure;

import java.util.Arrays;

// Задание 9 из списка задач к лабораторной работе №1
public class SortArrayAndPrint {
    public static void call(int[] array) {
        int i, element;

        Arrays.sort(array);

        for (i = 0; i < array.length; i++) {
            element = array[i];
            System.out.print(element + " ");
        }
    }
}
