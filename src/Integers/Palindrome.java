package Integers;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindromeTwoPointers(123));
        System.out.println(isPalindrome(121));

    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversed = 0;

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x/=10;
        }
        return x == reversed || x == reversed / 10;
    }

    public static  boolean isPalindromeTwoPointers(int x) {
        // write your code here
        String number = String.valueOf(x);

        int left = 0;
        int right = number.length() - 1;

        while (left <= right) {
            if (number.charAt(left) !=(number.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
