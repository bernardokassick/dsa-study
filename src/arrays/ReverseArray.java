package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1};
        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int a = 0;
        int b = arr.length - 1;
        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}
