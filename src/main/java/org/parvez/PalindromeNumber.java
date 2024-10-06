package org.parvez;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int n = x;
        int reverse = 0;
        while (n > 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }
        return x == reverse;
    }

    public static boolean isPalindromeOptimized(int x) {
        // Negative numbers and numbers ending with 0 (but not 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reverseHalf = 0;

        while (x > reverseHalf) {
            reverseHalf = reverseHalf * 10 + x % 10;
            x = x / 10;
        }
        return x == reverseHalf || x == reverseHalf / 10;
    }

    public static void main(String[] args) {
        boolean isPalindrome = isPalindrome(121);
        System.out.println(isPalindrome);

        boolean isPalindromeOptimized = isPalindromeOptimized(121);
        System.out.println(isPalindromeOptimized);

    }
}
