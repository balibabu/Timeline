public class dutch_algo_3nos {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 0, 3, 1, 1, 2, 3, 0, 0, 3, 1, 2, 3, 0, 1, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int low = 0, mid1 = 0, mid2 = 0, high = arr.length - 1;
        while (mid2 <= high) {
            if (arr[mid2] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid2];
                arr[mid2] = temp;
                low++;
                if (mid1 < low)
                    mid1++;
                if (mid2 < mid1)
                    mid2++;

            } else if (arr[mid2] == 1) {
                int temp = arr[mid1];
                arr[mid1] = arr[mid2];
                arr[mid2] = temp;
                mid1++;
                mid2++;
            } else if (arr[mid2] == 2) {
                mid2++;
            } else if (arr[mid2] == 3) {
                int temp = arr[high];
                arr[high] = arr[mid2];
                arr[mid2] = temp;
                high--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
