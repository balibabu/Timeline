public class qn6 {
    public static void main(String[] args) {
        String word = "balibabu";
        int fparity = 0;
        int[] arr = new int[word.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = parity((int) word.charAt(i));
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(word.charAt(i) + "-->" + arr[i] + " ");
            fparity ^= arr[i];
        }
        System.out.println("\nparity of " + word + " is " + fparity);

    }

    static int parity(int n) {
        int result = 0;
        while (n != 0) {
            n = n & (n - 1);
            result ^= 1;
        }
        return result;
    }
}
