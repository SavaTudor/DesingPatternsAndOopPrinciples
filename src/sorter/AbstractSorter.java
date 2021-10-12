package sorter;

import utils.Order;

abstract public class AbstractSorter implements Sorter {
    int[] array;
    Order order;

    public AbstractSorter(int[] array, Order order) {
        this.array = array;
        this.order = order;
    }

    @Override
    abstract public void sort();
}
