package arrays;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = new int[]{-11, 123, 123, 11234, 12345};
        System.out.println(findEvenDigits(arr));
    }

    static int findEvenDigits(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (evenNumber(countDigits(arr[i]))) {
                count++;
            }
        }
        return count;
    }


    static boolean evenNumber(int num) {
        return num % 2 == 0;
    }

    static int countDigits(int num) {
        int count = 0;
        if (num == 0) return 1;

        if (num < 0) {
            num = num * (-1);
        }
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
