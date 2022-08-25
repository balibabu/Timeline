import java.util.ArrayList;

public class first_n_prime {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> prime = new ArrayList<>();
        int num = 2;
        int counter = 1;
        while (counter <= 10) {
            if (is_prime(num)) {
                counter++;
                prime.add(num);
            }
            num++;
        }
        System.out.println(prime);

    }

    public static boolean is_prime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
