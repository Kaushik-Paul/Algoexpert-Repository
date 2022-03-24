package io.algoexpert.easy;

public class CaesarCipherEncryptor {

    public static String caesarCipherEncryptor(String string, int n) {
        char[] ch = string.toCharArray();
        n = n % 26;
        for (int i = 0; i < ch.length; i++) {
            int key = ch[i] + n;
            if (key > 122) {
                ch[i] = (char) (key - 26);
            } else {
                ch[i] = (char) (key);
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String string = "xyz";
        int n = 2;
        System.out.println("Caesar Cipher Encryptor of the string is: " + caesarCipherEncryptor(string, n));
    }
}
