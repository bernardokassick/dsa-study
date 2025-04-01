package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CountingValleys {
    public static void main(String[] args) {
        int steps = 12;
        String path = "DDUUDDUDUUUD";
        countingValleys(steps, path);

    }

    public static int countingValleys(int steps, String path) {
        int valleys = 0;
        int soma = 0;
        List<Integer> altura = new ArrayList<>();

        for (int i = 0; i < steps; i++) {
            char ch = path.charAt(i);
            if (ch == 'D'){
                soma--;
            }
            if (ch == 'U') {
                soma++;
            }
            altura.add(soma);
            //System.out.println("altura atual: " + soma);
        }

        for (int i = 0; i < altura.size(); i++) {
            if (altura.get(i) == 0) {
                if (altura.get(i-1) < 0) {
                    valleys++;
                }
            }

        }

        //System.out.println("vales: " + valleys);
    return valleys;
    }
}
