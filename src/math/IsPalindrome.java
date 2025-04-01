package math;

public class IsPalindrome {
    public static void main(String[] args) {
        int number = 121;
        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int num = x;

        int total = 0;
        int div = 0;
        int rest = 0;

        while (num != 0) {
            rest = num % 10;
            div = num / 10;


            total = total * 10 + rest;
            num = div;

        }
        if (x == total) {
            return true;
        } else {
            return false;
        }
    }
}
