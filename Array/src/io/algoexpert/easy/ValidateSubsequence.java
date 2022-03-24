package io.algoexpert.easy;

public class ValidateSubsequence {

    public static boolean isSubsequence(int[] array1, int[] array2) {
        int pointer1 = 0;
        int pointer2 = 0;
        int length1 = array1.length;
        int length2 = array2.length;
        while (pointer1 < length1 && pointer2 < length2) {
            if (array1[pointer1] == array2[pointer2]) {
                pointer2++;
            }
            pointer1++;
        }
        return pointer2 == length2;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{5, 1, 22, 25, 6, -1, 8, 10};
        int[] array2 = new int[]{1, 6, -1, 10};
        System.out.println("Subsequence: " + isSubsequence(array1, array2));
    }
}
