package io.algoexpert.easy;

public class BinarySearch {

    public static boolean binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == target) {
                return true;
            } else if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        int target = 33;
        System.out.println("Is the number present: " + binarySearch(array, target));
    }
}
