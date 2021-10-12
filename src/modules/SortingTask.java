package modules;

import sorter.*;
import utils.Order;
import utils.sort.BubbleSort;
import utils.sort.QuickSort;

public class SortingTask extends Task {
    int[] array;
    SortingStrategy strategy;
    Sorter sorter;

    public SortingTask(String id, String desc, int[] arr, SortingStrategy strategy) {
        super(id, desc);
        this.array = arr;
        this.strategy = strategy;
        if (strategy == SortingStrategy.BUBBLE_SORT) {
            sorter = new BubbleSorter(arr, Order.ASCENDING);
        } else{
            sorter = new QuickSorter(arr, Order.ASCENDING);
        }
    }

    @Override
    public void execute() {
        sorter.sort();
    }
}
