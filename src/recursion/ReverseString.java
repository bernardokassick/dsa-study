package recursion;

public class ReverseString {
    public static void main(String[] args) {
        String word = "paralelepipedo";
        System.out.println(reverseString(word,0, word.length() - 1));
    }

    public static String reverseString(String wordToReverse, int start, int end) {
        if (wordToReverse.length() <= 0) {
            return "";
        }
        if (start > end) {
            return "";
        }
        // pega a ultima letra da palavra, joga pra primeira, e soma com o restante da string
        return wordToReverse.substring(end) + reverseString(wordToReverse.substring(start, end), start, end - 1);
    }



/*
pegar a string
cortar a primeira letra
retornar o que sobra + a primeira letra
 */

}
