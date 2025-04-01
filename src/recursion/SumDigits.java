package recursion;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigit(1203));

    }

    static int sumDigit(int num) {
        if (num == 0) {
            return 0;
        }
        // com % pega o ultimo digito, e com o / pega os outros, atualiza o numero e faz de novo
        return num % 10 + sumDigit(num / 10);
    }
}
