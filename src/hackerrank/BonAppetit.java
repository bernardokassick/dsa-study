package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BonAppetit {
    public static void main(String[] args) {
        System.out.println(bonAppetit("teste"));

    }

    public static boolean bonAppetit(String frase) {
        // Write your code here
//        bill: an array of integers representing the cost of each item ordered
//        k: an integer representing the zero-based index of the item Anna doesn't eat
//        b: the amount of money that Anna contributed to the bill
//        int valueDidntEat = bill.get(k);
//        bill.remove(k);
//
//        int totalAnna = bill.stream().reduce(0,Integer::sum) / 2;
//
//        if (totalAnna < b) {
//            System.out.println(b - totalAnna);
//        } else {
//            System.out.println("Bon Appetit");
//        }

        if (frase == null) {
            return false;
        }

        //usando two pointer
        int left = 0;
        int right = frase.length() -1;

        while (left < right) {
            if(frase.charAt(left) != frase.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
return true;
    }
}
