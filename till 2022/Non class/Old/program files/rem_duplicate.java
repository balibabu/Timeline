import java.util.ArrayList;
import java.util.Arrays;

public class rem_duplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 6, 1, 3, 9, 0, 3, 4, 5, 7, 5, 3, 4, 6, 3, 5, 4, 3, 2, 2 };
        ArrayList<Integer> new_arr = new ArrayList<>();
        Arrays.sort(arr);
        int dup = arr[0];
        new_arr.add(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            if (dup != arr[i]) {
                new_arr.add(arr[i]);
                dup = arr[i];
            }
        }
        System.out.println(new_arr);
    }
}
