package sorter;

import utils.Order;
import utils.sort.QuickSort;

public class QuickSorter extends AbstractSorter{
    public QuickSorter(int[] array, Order order) {
        super(array, order);
    }

    @Override
    public void sort() {
        QuickSort.sort(array, order);
    }
}
