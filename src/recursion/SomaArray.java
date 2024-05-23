package recursion;

public class SomaArray {
    public static void main(String[] args) {
        int myArr[] = new int[6];

        myArr[0] = 1;
        myArr[1] = 2;
        myArr[2] = 3;
        myArr[3] = 4;
        myArr[4] = 5;
        myArr[5] = 6;

        System.out.println(somaArray(myArr, 6));
    }

    public static int somaArray(int[] nums, int length) {
        if (length <= 0) {
            return 0;
        }

        return somaArray(nums, length -1) + (length - 1) ;

    }
}
