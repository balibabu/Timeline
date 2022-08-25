import java.util.ArrayList;

public class array_add_1 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<Integer>();
        arr.add(9);
        arr.add(9);
        arr.add(9);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        int num = (int) arr.get(arr.size() - 1) + 1;
        int carry;
        for (int i = arr.size() - 2; i >= 0; i--) {
            carry = num / 10;
            int rem = num % 10;
            arr.set(i + 1, rem);
            num = (int) arr.get(i) + carry;
        }
        carry = num / 10;
        int rem = num % 10;
        arr.set(0, rem);
        if (carry > 0) {
            arr.add(0, carry);
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

    }
}
