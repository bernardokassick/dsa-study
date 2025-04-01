package arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

//        int[] nums1 = new int[] {1,2,3,0,0,0};
//        int[] nums2 = new int[] {2,5,6};

        int[] nums1 = new int[] {0};
        int[] nums2 = new int[] {1};

        merge(nums1,0, nums2,1);

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0 ) return;
        int[] asw = new int[m + n];
        for (int i = 0; i < m; i++) {
            asw[i] = nums1[i];
        }

        for (int j = 0; j < n; j++) {
            asw[m + j] = nums2[j];

        }
        nums1 = asw;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1.length; j++) {

                if (nums1[i] < nums1[j]) {
                    int aux = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = aux;
                }

            }
        }

    } // merge

//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int[] asw = new int[m + n];
//        for (int i = 0; i < m; i++) {
//            asw[i] = nums1[i];
//        }
//
//        for (int j = 0; j < n; j++) {
//            asw[m + j] = nums2[j];
//
//        }
//        nums1 = asw;
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums1.length; j++) {
//
//                if (nums1[i] < nums1[j]) {
//                    int aux = nums1[i];
//                    nums1[i] = nums1[j];
//                    nums1[j] = aux;
//                }
//            }
//        }
//        for (int aux = 0; aux < nums1.length; aux++) {
//            System.out.print(nums1[aux] + " ");
//
//        }
//    }

}
