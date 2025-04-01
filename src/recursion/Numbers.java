package recursion;

public class Numbers {
    public static void main(String[] args) {

        print(1);
    }

    private static void print(int n) {
        if (n > 5) return;
        System.out.println(n);
        print(n + 1);
    }
}
