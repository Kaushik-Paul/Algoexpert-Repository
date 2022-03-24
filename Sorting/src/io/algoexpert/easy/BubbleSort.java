package io.algoexpert.easy;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    isSorted = false;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 2, 8, 5, 6, 3, 9};
        bubbleSort(array);
        System.out.println("Sorted Array is: " + Arrays.toString(array));
    }
}
