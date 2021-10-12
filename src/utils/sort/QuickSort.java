package utils.sort;

import utils.Order;

public class QuickSort {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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

    private static void quickSort(int[] arr, int a, int b, Order order) {
        if (order == Order.ASCENDING) {
            if (a < b) {
                int p = partitionAscending(arr, a, b);
                quickSort(arr, a, p - 1, order);
                quickSort(arr, p + 1, b, order);
            }
        }
    }

    public static void sort(int[] arr, Order order){
        quickSort(arr, 0, arr.length-1, order);
    }

}
