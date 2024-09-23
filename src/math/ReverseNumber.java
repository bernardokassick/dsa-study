package math;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 123;


        int total = 0;
        int div = 0;
        int rest = 0;

        int[] nums;
        int count = 0;
        while (num != 0) {
            rest = num % 10;
            div = num / 10;

            num = div;
            nums[count] = rest;
            count++;
        }

        for (int i = 0; i < nums.length; i++) {
            total += nums[i] * Math.pow(10, count);
            count--;

        }

        System.out.println(total);

    }
}
