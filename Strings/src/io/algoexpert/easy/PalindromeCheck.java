package io.algoexpert.easy;

public class PalindromeCheck {

    public static boolean isPalindrome(String string) {
        int left = 0;
        int right = string.length() - 1;
        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String string = "abcdcba";
        System.out.println("Is the String Palindrome: " + isPalindrome(string));
    }
}
