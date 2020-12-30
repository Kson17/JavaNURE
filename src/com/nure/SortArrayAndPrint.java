package com.nure;

import java.util.Arrays;

// Задание 9 из списка задач к лабораторной работе №1
// Задан массив целых чисел.
// В нем — последовательность чисел, разделенных одним или несколькими нулями.
// Оставить по одному нулю в качестве разделителя.

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
