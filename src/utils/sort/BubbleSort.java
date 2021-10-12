package utils.sort;

import utils.Order;

public class BubbleSort {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void sort(int[] arr, Order order) {
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
}
