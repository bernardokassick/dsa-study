package Integers;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(5));
    }

    public static String[] fizzBuzz(int n) {
        // write your code here
        String arr[] = new String[n];

        for (int i = 1; i <= n; i++) {

            String aux = "";


            if(i % 3 == 0 && i % 5 == 0) {
                aux = "FizzBuzz";
            } else if(i % 3 == 0) {
                aux = "Fizz";
            } else if(i % 5 == 0) {
                aux = "Buzz";
            } else {
                aux = ""+ i;
            }

            arr[i - 1] = aux;
        }
        return arr;
    }
}
