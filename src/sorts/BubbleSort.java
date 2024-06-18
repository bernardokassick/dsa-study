package sorts;

public class BubbleSort {
    public static void main(String[] args) {

        int[] nums = new int[]{5,4,8,2,1};

        bubbleSort(nums);

        for (int num : nums) {
            System.out.println(num);
        }

    }

    public static void bubbleSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if (nums[i] < nums[j]) {
                    int aux = nums[i];
                    nums[i] = nums[j];
                    nums[j] = aux;
                }

            }


        }
    }
}
