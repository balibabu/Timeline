public class dutch_false_true {
    public static void main(String[] args) {
        boolean[] array = { true, false, false, true, true, false };
        int low = 0, high = array.length - 1;
        while (low < high) {
            if (array[low] == true) {
                low++;
            } else {
                boolean t = array[high];
                array[high] = array[low];
                array[low] = t;
                high--;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
