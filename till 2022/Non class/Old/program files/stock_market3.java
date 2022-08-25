import java.util.ArrayList;
import java.util.Arrays;

public class stock_market3 {
    public static void main(String[] args) {
        ArrayList<Integer> price = new ArrayList<>(Arrays.asList(10, 22, 5, 75, 65, 80));
        System.out.println(stock(price));

    }

    public static int stock(ArrayList<Integer> price) {

        // profit from forward
        ArrayList<Integer> forward_profit = new ArrayList<>();
        int min_price_so_far = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < price.size(); i++) {
            min_price_so_far = Math.min(min_price_so_far, price.get(i));
            max_profit = Math.max(max_profit, price.get(i) - min_price_so_far);
            forward_profit.add(max_profit);
        }

        // profit from backward
        int max_price_so_far = 0;
        int max_total_profit = 0;
        for (int i = price.size() - 1; i > 0; i--) {
            max_price_so_far = Math.max(max_price_so_far, price.get(i));
            max_total_profit = Math.max(max_total_profit, max_price_so_far - price.get(i) + forward_profit.get(i - 1));
        }
        return max_total_profit;
    }
}
