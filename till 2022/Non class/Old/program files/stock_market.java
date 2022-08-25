import java.util.ArrayList;
import java.util.Arrays;

public class stock_market {
    public static void main(String[] args) {
        ArrayList<Integer> rate = new ArrayList<>(Arrays.asList(3, 1, 4, 8, 7, 2, 5));
        ArrayList<Integer> max_rate = (ArrayList<Integer>) rate.clone();
        int max = (int) rate.get((int) rate.size() - 1);
        for (int i = (int) rate.size() - 1; i >= 0; i--) {
            if ((int) rate.get(i) > max) {
                max = (int) rate.get(i);
            }
            max_rate.set(i, max);
        }
        System.out.println(rate);
        System.out.println(max_rate);
        int maximumProfit = 0;
        for (int i = 0; i < rate.size(); i++) {
            int profit = max_rate.get(i) - rate.get(i);
            if (maximumProfit < profit) {
                maximumProfit = profit;
            }
        }
        System.out.println("Maximum Profit=" + maximumProfit);
    }
}
