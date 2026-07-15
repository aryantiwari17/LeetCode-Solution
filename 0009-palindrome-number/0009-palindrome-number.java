class Solution {
    public boolean isPalindrome(int x) {
        // Special cases:
        // 1. Negative numbers are not palindromes.
        // 2. Numbers ending in 0 (but not 0 itself) are not palindromes.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        
        // Loop until the original number is less than or equal to the reversed half.
        // This means we have processed at least half of the digits.
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // When the length is odd, we can get rid of the middle digit by reversedHalf / 10
        // Example: x = 12321 -> end of loop: x = 12, reversedHalf = 123
        return x == reversedHalf || x == reversedHalf / 10;
    }
}