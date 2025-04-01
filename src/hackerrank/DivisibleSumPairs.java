package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>(Arrays.asList(1,3,2,6,1,2));

        System.out.println(divisibleSumPairs(ar.size(), 3, ar));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < ar.size()- 1; i++) {
            for(int j = i + 1; j < ar.size(); j++) {
                int somaPair = ar.get(i) + ar.get(j);

                if (somaPair % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
