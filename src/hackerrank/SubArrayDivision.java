package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayDivision {
    public static void main(String[] args) {
        List<Integer> chocolate = new ArrayList<>(Arrays.asList(2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1));

        System.out.println(birthday(chocolate, 18, 7));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        // day -> sum of int
        // month -> total of squares that will be sum
        int count = 0;
        int left = 0;
        int right = m;

        while (right <= s.size()) {
            List<Integer> subList = s.subList(left, right);

            int result = subList.stream().reduce(0, Integer::sum);

            if (result == d) {
                count++;
            }
            left++;
            right++;
        }


        return count;
    } // method
} //main
