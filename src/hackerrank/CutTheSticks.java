package hackerrank;

import java.util.*;

public class CutTheSticks {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 3, 2, 1));

        System.out.println(cutTheSticks(test));
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> sticksCut = new ArrayList<>();

        while (!arr.isEmpty()) {
            sticksCut.add(arr.size());

            int minValue = getMinor(arr);

            for (int i = 0; i < arr.size(); i++) {
                arr.set(i, arr.get(i) - minValue);
            } //for
            arr.removeIf(stick -> stick == 0);
        } // while

        return sticksCut;
    }
    
    public static int getMinor(List<Integer> arr) {
        int minor = 9999;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < minor) {
                minor = arr.get(i);
            }
            
        }
        return minor;
    }
}
