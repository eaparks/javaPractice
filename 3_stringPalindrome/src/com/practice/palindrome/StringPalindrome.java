package com.practice.palindrome;

public class StringPalindrome {

    public boolean isAPalindrome(String input) {

        if (input == null || input.length() < 2) {
            return false;
        }
        int index = 0;

        char[] inputChars = input.toCharArray();
        int charCount = inputChars.length;
        for (int i = 0; i <= charCount / 2; i++) {
            if (inputChars[i] != inputChars[charCount - (i + 1)]) {
                return false;
            }
        }
        return true;
    }
}
