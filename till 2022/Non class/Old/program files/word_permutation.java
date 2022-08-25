import java.util.HashMap;
import java.util.HashSet;

public class word_permutation {
    static int counter = 0;

    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        String word = "abcd";
        Arrange("", word);
        System.out.println("\nTotal possibilities " + counter);
        System.out.println("Total time taken " + (System.currentTimeMillis() - t1) + " miliseconds");

    }

    static void Arrange(String str, String word) {
        if (word.length() == 1) {
            System.out.println(str + word);
            counter++;
        } else {

            for (int i = 0; i < word.length(); i++) {
                String temp = word.substring(0, i) + word.substring(i + 1, word.length());
                Arrange(str + word.charAt(i), temp);
            }
        }
    }
}
