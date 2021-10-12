package utils;

public class Sort {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void bubbleSort(int[] arr, Order order) {
        int n = arr.length;
        int i, temp;
        boolean changed = true;
        while (changed) {
            changed = false;
            for (i = 0; i < n - 1; i++) {
                if (order == Order.ASCENDING) {
                    if (arr[i] > arr[i + 1]) {
                        swap(arr, i, i + 1);
                        changed = true;
                    }
                } else {
                    if (arr[i] < arr[i + 1]) {
                        swap(arr, i, i + 1);
                        changed = true;
                    }
                }
            }
            n--;
        }
    }

    private static int partitionAscending(int[] arr, int a, int b) {
        int pivot = arr[b];
        int i = a - 1;
        for (int j = a; j < b; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }

        }
        swap(arr, i + 1, b);
        return i + 1;
    }

    public static void quickSort(int[] arr, int a, int b, Order order) {
        if(order==Order.ASCENDING) {
            if (a < b) {
                int p = partitionAscending(arr, a, b);
                quickSort(arr, a, p - 1, order);
                quickSort(arr, p + 1, b, order);
            }
        }
    }
}
