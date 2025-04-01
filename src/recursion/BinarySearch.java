package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int length = 6;
        int[] myArr = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

//        binarySearchIterative(myArr, 6);
        System.out.println(binarySearch(myArr, 0, myArr.length - 1, 8));


    } //main

    static void binarySearchIterative(int arr[], int num) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) { // if they're equals, that's means the loop is finished
            int mid = start + (end - start) / 2;

            if (num == arr[mid]) {
                System.out.println("achouuuu, na posicao: " + mid);
                return;
            } else if (num <= arr[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
    } //iterative


    static int binarySearch(int arr[], int start, int end, int num) {
        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (num == arr[mid]) {
            return mid;
        }
        if (num < arr[mid]) {
            return binarySearch(arr, start, mid - 1, num);
        }
        return binarySearch(arr, mid + 1, end, num);
    }


} // class
