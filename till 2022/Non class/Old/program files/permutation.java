
public class permutation {
    static int counter = 0;
    static String[] set;

    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        String str = "abcdefg";

        System.out.println();
        // to find factorial of length
        int f = 1;
        for (int i = 1; i <= str.length(); i++) {
            f *= i;
        }
        set = new String[f];

        // to convert string into array of character
        char[] Arr = new char[str.length()];
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = str.charAt(i);
        }
        String remArr = "";

        // recursion starts from here
        Arrange(Arr, remArr);
        System.out.println("\ntotal possibilities are " + counter);
        System.out.println(System.currentTimeMillis() - t1);
    }

    public static void Arrange(char[] Arr, String remArr) {
        if (Arr.length == 2) {
            print(Arr, remArr);
            char temp = Arr[0];
            Arr[0] = Arr[1];
            Arr[1] = temp;
            print(Arr, remArr);
        } else {
            for (int i = 0; i < Arr.length; i++) {
                Arrange(get(Arr, i), rem(Arr, i, remArr));
                // System.out.println(String.valueOf(get(Arr, i)) + " " + rem(Arr, i, remArr));
            }
        }
    }

    public static char[] get(char[] Arr, int i) {
        char[] temp = new char[Arr.length - 1];
        int c = 0;
        for (int j = 0; j < Arr.length; j++) {
            if (i != j) {
                temp[c] = Arr[j];
                c++;
            }
        }
        // System.out.println(temp);
        return temp;
    }

    public static String rem(char[] Arr, int i, String remArr) {
        for (int j = 0; j < Arr.length; j++) {
            if (i == j) {
                remArr += Arr[j];
            }
        }
        // System.out.println(remArr);
        return remArr;
    }

    public static void print(char[] Arr, String remArr) {
        String w = remArr + Arr[0] + Arr[1];
        for (int i = 0; i < counter; i++) {
            if (set[i].equals(w)) {
                return;
            }
        }
        set[counter] = w;
        System.out.println(w);
        counter++;
    }
}