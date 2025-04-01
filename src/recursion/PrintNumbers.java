package recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        int num = 5;

        printNumbersToOne(num);
        System.out.println("--------------------------");
        printNumbersToNum(num);

    }

    public static void printNumbersToOne(int num) {
        if (num <= 0) {
            return;
        }
        System.out.println(num);
        printNumbersToOne(num - 1);
    }

    public static void printNumbersToNum(int num) {
        if (num == 0) {
            return;
        }

        printNumbersToNum(num - 1);
        System.out.println(num);

    }
}
