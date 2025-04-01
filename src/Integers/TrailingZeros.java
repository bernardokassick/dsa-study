package Integers;

public class TrailingZeros {
    public static void main(String[] args) {
        System.out.println(trailingZeroes2(19));
    }

    public static int trailingZeroes2(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }
    public static int trailingZeroes(int n) {

        int count = 0;
        int factorial = 1;

        for(int i = n; i > 0; i--) {
            factorial = factorial * i;


        }
        if (factorial % 10 == 0){
            int aux = 10;
            while (factorial  % aux == 0) {
                count++;
                aux *= 10;
            }
        }

        return count;
    }
}
