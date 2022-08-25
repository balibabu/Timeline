import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class rem_dupl {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 1, 3, 5, 1, 2, 3, 5, 1, 3, 5, 1, 2));
        Collections.sort(arr);
        System.out.println(arr);
        int n = (int) arr.get(0);
        int i = 1;
        while (i < arr.size()) {
            if ((int) arr.get(i) == n) {
                arr.remove(i);
            } else {
                n = (int) arr.get(i);
                i++;
            }
        }

        System.out.println(arr);
    }

}
