package io.algoexpert.easy;

import java.util.Arrays;
import java.util.HashSet;

public class TwoNumberSum {

    public static int[] getTwoNumberSum(int[] array, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            int diff = target - num;
            if (set.contains(diff)) {
                return new int[]{num, diff};
            } else {
                set.add(num);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        int target = 10;
        int[] value = getTwoNumberSum(array, target);
        System.out.println("The two number sums are: " + Arrays.toString(value));
    }
}
