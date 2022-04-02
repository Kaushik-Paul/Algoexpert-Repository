package io.algoexpert.medium;

public class PalindromeByRemovingCharacter {

    public static int palindromeCheck(String string) {
        int low = 0;
        int high = string.length() - 1;
        while (low <= high) {
            if (string.charAt(low) == string.charAt(high)) {
                low++;
                high--;
            } else {
                if (isPalindrome(string, low + 1, high)) {
                    return low;
                }
                if (isPalindrome(string, low, high - 1)) {
                    return high;
                }
                return Integer.MIN_VALUE;
            }
        }
        return -1;
    }

    private static boolean isPalindrome(String string, int low, int high) {
        while (low <= high) {
            if (string.charAt(low) != string.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args) {
        String string = "abxcba";
        System.out.println("The Palindrome: " + palindromeCheck(string));
    }
}
