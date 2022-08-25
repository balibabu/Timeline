import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class remove_duplicate_key {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 1, 3, 5, 1, 2, 3, 5, 1, 3, 5, 1, 2));
        Collections.sort(arr);
        System.out.println(arr);
        int i = 0;
        int key = 2;
        System.out.println("key=" + key);
        while (i < arr.size()) {
            if ((int) arr.get(i) == key) {
                arr.remove(i);
            } else {
                i++;
            }
        }
        arr.add(key);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
