package io.algoexpert.easy;

import java.util.Arrays;

public class ThreeLargestNumber {

    public static int[] findThreeLargestNumber(int[] array) {
        int[] threeLargest = new int[3];
        Arrays.fill(threeLargest, Integer.MIN_VALUE);
        for (int num : array) {
            updateLargest(threeLargest, num);
        }
        return threeLargest;
    }

    private static void updateLargest(int[] threeLargest, int num) {
        if (threeLargest[2] == Integer.MAX_VALUE || threeLargest[2] < num) {
            shiftAndUpdate(threeLargest, num, 2);
        } else if (threeLargest[1] == Integer.MAX_VALUE || threeLargest[1] < num) {
            shiftAndUpdate(threeLargest, num, 1);
        } else if (threeLargest[0] == Integer.MAX_VALUE || threeLargest[0] < num) {
            shiftAndUpdate(threeLargest, num, 0);
        }
    }

    private static void shiftAndUpdate(int[] threeLargest, int num, int position) {
        for (int i = 0; i < position; i++) {
            threeLargest[i] = threeLargest[i + 1];
        }
        threeLargest[position] = num;
    }

    public static void main(String[] args) {
        int[] array = new int[]{141, 17, 1, -7, -17, -27, 18, 541, 8, 7, 7};
        int[] threeLargestNumber = findThreeLargestNumber(array);
        System.out.println("The Three Largest Number are: " + Arrays.toString(threeLargestNumber));
    }
}
