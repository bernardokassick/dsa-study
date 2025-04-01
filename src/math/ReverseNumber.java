package math;

public class ReverseNumber {
    public static void main(String[] args) {
        Integer total = reverseNumber();

        System.out.println(total);

    }

    private static Integer reverseNumber() {
        int num = 123;


        int total = 0;
        int div = 0;
        int rest = 0;

        while (num != 0) {
            rest = num % 10;
            div = num / 10;

            if (
                    total > Integer.MAX_VALUE / 10 ||
                            (total == Integer.MAX_VALUE / 10 && rest > 7)
            ) return null;
            if (
                    total < Integer.MIN_VALUE / 10 ||
                            (total == Integer.MIN_VALUE / 10 && rest < -8)
            ) return null;

            total = total * 10 + rest;
            num = div;

        }
        return total;
    }
}
