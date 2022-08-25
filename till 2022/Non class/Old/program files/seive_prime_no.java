import java.util.ArrayList;

public class seive_prime_no {
    public static void main(String[] args) {
        ArrayList<Boolean> arr = new ArrayList<>();
        int n = 20;
        int size = (int) Math.floor(0.5 * (double) (n - 3) + 1);
        for (int i = 0; i < size; i++) {
            arr.add(true);
        }
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        for (int i = 0; i < size; i++) {
            if (arr.get(i)) {
                int p = i * 2 + 3;
                primes.add(p);
                arr.set(i, false);
                for (int j = (2 * i * i + 6 * i + 3); j < size; j += p) {
                    arr.set(j, false);
                }
            }
        }
        System.out.println(primes);
    }
}
