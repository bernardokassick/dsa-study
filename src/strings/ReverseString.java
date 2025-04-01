package strings;

public class ReverseString {
    public static void main(String[] args) {
        char[] str = {'h','e','l','l','o'};
        reverseString(str);
        System.out.println(str);
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char aux;

        while (left <= right) {
            aux = s[left];
            s[left] = s[right];
            s[right] = aux;

            left++;
            right--;
        }
    }
}
