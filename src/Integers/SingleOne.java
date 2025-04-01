package Integers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleOne {
    public static void main(String[] args) {
    int[] nums = {4,2,4,1,3,1,3};

        System.out.println(findSingleOneHashMap(nums));
        System.out.println(findSingleOneSet(nums));
        System.out.println(findSingleOneXOR(nums));

    }

    public static int findSingleOneXOR(int[] nums) {
        int singleOne = 0;
        for (int num : nums) {
            singleOne = singleOne ^ num;
        }
        return singleOne;
    }

    public static int findSingleOneSet(int[] nums) {
        Set<Integer> onlyOne= new HashSet<>();

        for (int num : nums) {
            if (!onlyOne.add(num)) {
                onlyOne.remove(num);
            }
        }
        return onlyOne.iterator().next();
    }
    public static int findSingleOneHashMap(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(Integer number : nums) {
            freq.put(number, freq.getOrDefault(number,0) + 1);
        }

        int menorValor = Integer.MAX_VALUE;
        Integer currentKey = null;

        for (Integer aux: nums) {
            if(freq.get(aux) < menorValor) {
                menorValor = freq.get(aux);
                currentKey = aux;
            }

        }
        return currentKey;
    }
}
