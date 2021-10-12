package sorter;

import utils.Order;
import utils.sort.BubbleSort;

public class BubbleSorter extends AbstractSorter{
    public BubbleSorter(int[] array, Order order) {
        super(array, order);
    }

    @Override
    public void sort() {
        BubbleSort.sort(array, order);
    }
}
