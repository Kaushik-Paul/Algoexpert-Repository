package io.algoexpert.easy;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{8, 5, 2, 9, 5, 6, 3};
        insertionSort(array);
        System.out.println("The Sorted array is: " + Arrays.toString(array));
    }
}
