class dutch_algo_4nos {
    public static void main(String[] args) {
        int[] arr = { 4, 4, 4, 0, 1, 1, 3, 3, 2, 0, 0, 3, 1, 1, 3, 2, 0, 1, 0, 3, 1 };
        int low = 0, mid1 = 0, mid2 = 0, mid3 = 0, high = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            while (mid3 <= high) {
                switch (arr[mid3]) {
                case 0:
                    int temp = arr[mid3];
                    arr[mid3] = arr[low];
                    arr[low] = temp;
                    low++;
                    if (mid1 < low)
                        mid1++;
                    if (mid2 < mid1)
                        mid2++;
                    if (mid3 < mid2)
                        mid3++;
                    break;
                case 1:
                    int temp2 = arr[mid3];
                    arr[mid3] = arr[mid1];
                    arr[mid1] = temp2;
                    mid1++;
                    if (mid2 < mid1)
                        mid2++;
                    if (mid3 < mid2)
                        mid3++;
                    break;
                case 2:
                    int temp3 = arr[mid2];
                    arr[mid2] = arr[mid3];
                    arr[mid3] = temp3;
                    mid2++;
                    mid3++;
                    break;
                case 3:
                    mid3++;
                    break;
                case 4:
                    int temp4 = arr[high];
                    arr[high] = arr[mid3];
                    arr[mid3] = temp4;
                    high--;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}