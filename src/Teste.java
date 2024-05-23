import java.lang.reflect.Array;

public class Teste {
    public static void main(String[] args) {

        testeReverse(1, 3);
    }

    public static void testeReverse(int m, int n) {
        int myArr[] = new int[6];

        myArr[0] = 1;
        myArr[1] = 2;
        myArr[2] = 3;
        myArr[3] = 4;
        myArr[4] = 5;
        myArr[5] = 6;


        int x = m;
        int y = n;
        int tempX;
        int tempY;

        while(x != y && x < y) {
            tempX = myArr[x];
            tempY = myArr[y];

            myArr[x] = tempY;
            myArr[y] = tempX;

            x++;
            y--;
        }
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }
    }
}
