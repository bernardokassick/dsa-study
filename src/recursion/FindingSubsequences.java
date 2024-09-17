package recursion;

public class FindingSubsequences {

    public static void main(String[] args) {
        String sequence = "abc";

        String result = findingSubsequences(sequence);
        System.out.println(result);
    }


    // return the total number of subsquences of the word
    public static String findingSubsequences(String word) {

        if (word.isEmpty()) return "";

        char first = word.charAt(0);
        String rest = findingSubsequences(word.substring(1));

        String result = "";

        for (String subSeq: rest.split(",", -1)) {

            result += "," + first + subSeq;
            result += "," + subSeq;

        }

        return result.substring(1);

    }


}
