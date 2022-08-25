import java.util.ArrayList;
import java.util.Arrays;

public class arraylis_product {
    public static void main(String[] args) {
        ArrayList num1 = new ArrayList<Integer>(Arrays.asList(2, 3));
        ArrayList num2 = new ArrayList<Integer>(Arrays.asList(3, 2));
        ArrayList result = new ArrayList<Integer>();
        for (int i = 0; i < (num1.size() + num2.size()); i++)
            result.add(0);

        for (int i = num1.size() - 1; i >= 0; i--) {
            for (int j = num2.size() - 1; j >= 0; j--) {
                int val = (int) result.get(i + j + 1) + (int) num1.get(i) * (int) num2.get(j);
                result.set(i + j + 1, val);
                result.set(i + j, (int) result.get(i + j) + val / 10);
                result.set(i + j + 1, val % 10);
            }
        }

        System.out.println(result);

    }
}
