import java.util.ArrayList;
import java.util.Arrays;

public class stock_market2 {
    public static void main(String[] args) {
        ArrayList<Integer> p = new ArrayList<>(Arrays.asList(3, 1, 4, 6, 7, 5, 2));
        int minsofar = p.get(0);
        int max_profit = 0;
        for (int i = 0; i < p.size(); i++) {
            minsofar = Math.min(minsofar, p.get(i));
            max_profit = Math.max(max_profit, p.get(i)) - minsofar;
        }
        System.out.println(max_profit);
    }
}
