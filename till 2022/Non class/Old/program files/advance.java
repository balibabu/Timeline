public class advance {
    public static void main(String[] args) {
        int[] a = { 3, 3, 1, 0, 5, 0, 1 };
        int far = 0;
        for (int i = 0; i < a.length; i++) {
            int temp = i + a[i];
            if (temp > far) {
            }
            far = temp;
            if (far == a.length - 1)
                break;
        }

        if (far == a.length - 1) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }
    }
}
