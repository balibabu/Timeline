import java.util.ArrayList;

public class prime_below_n {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Boolean> prime = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            prime.add(true);
        }
        prime.set(0, false);
        prime.set(1, false);
        for (int i = 2; i < n; i++) {
            for (int j = i + i; j < n; j = j + i) {
                prime.set(j, false);
            }
        }
        for (int i = 0; i < n; i++) {
            if (prime.get(i)) {
                System.out.println(i);
            }
        }
    }
}
