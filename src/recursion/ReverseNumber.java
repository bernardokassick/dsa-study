//package recursion;
//
//public class ReverseNumber {
//    public static void main(String[] args) {
//        System.out.println(reverseNumber(123, 0));
//
//    }
//
//    static int reverseNumber(int num, int reverse) {
//        if (num % 10 == num) {
//            return num;
//        }
//        int rest = num % 10;
//        reverse = reverse * 10 + rest;
//
//        reverseNumber(num / 10, reverse);
//    }
//
//    static int helperFun(int num, int base) {
//
//    }
//}
