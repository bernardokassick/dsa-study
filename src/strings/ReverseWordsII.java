//package strings;
//
//public class ReverseWordsII {
//    public static void main(String[] args) {
//        System.out.println(ReverseWordsII("Let's take LeetCode contest"));
//    }
//
//    public static String ReverseWordsII(String s) {
//        int left = 0;
//        int right = 0;
//        int limit = s.length() - 1;
//        String result = "";
//        // enquanto o R nao chegou ao final da string
//        while(right <= limit ) {
//
//            // faz o R chegar ao primeiro espaço em branco
//            while(s.charAt(right) != ' ') {
//                right++;
//                if (right == limit) {
//                    break;
//                }
//            }
//
//            StringBuilder sb = new StringBuilder(s.substring(left, right));
//            char aux = sb.charAt(left);
//            sb.setCharAt(left, sb.charAt(right -1));
//            sb.setCharAt(right -1, aux);
//            left++;
//            right--;
//            result = result + sb.toString();
//        }
//        return result;
//    }
//}
