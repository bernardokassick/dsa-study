//package strings;
//
//public class ReverseStringII {
//    public static void main(String[] args) {
//        String str = "Hello";
//        System.out.println(reverseStr(str, 2));
//
//    }
//
//    public static String reverseStr(String s, int k) {
//        int left = 0;
//        int right = k - 1;
//
//        String start = s.substring(0, k);
//        String end = s.substring(k, s.length());
//
//        StringBuilder sb = new StringBuilder(s);
//
//        while (left <= right) {
//            char aux = sb.charAt(left);
//            sb.setCharAt(left, sb.charAt(right));
//            sb.setCharAt(right, aux);
//            left++;
//            right--;
//        }
//        return sb.toString();
//    }
//}
