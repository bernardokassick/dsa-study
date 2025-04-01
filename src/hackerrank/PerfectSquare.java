package hackerrank;

import org.w3c.dom.ls.LSOutput;

public class PerfectSquare {
    public static void main(String[] args) {
//        System.out.println(perfectSquare(9));

        System.out.println("total: " +howManyPerfectSquares(1, 25));

    }
    public static int howManyPerfectSquares(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if(perfectSquare(i)) {
               count++;
                System.out.println(i);
            }
        }
        return count;
    }

    public static boolean perfectSquare(int num) {
        for (int i = 0; i < num; i++) {

            if ((i * i) > num) {
                return false;
            }

            if (i * i == num) {
                return true;
            }

        }
        return false;
    }
}
