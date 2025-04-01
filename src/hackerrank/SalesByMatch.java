package hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SalesByMatch {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 1, 2, 1, 4, 5, 2, 3, 3, 3);
        int res = sockMerchant(numeros.size(), numeros);

        System.out.println("total"+ res);
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        int pairs = 0;
        List<Integer> newAr = ar.stream().distinct().collect(Collectors.toList());


        for (int i = 0; i < newAr.size(); i++) {
            int busca = newAr.get(i);
            long result = ar.stream().filter(num -> Objects.equals(num, busca))
                    .count();
            pairs = (int) (pairs + (result / 2));
        }

        return pairs;
        // Write your code her
    }

}
