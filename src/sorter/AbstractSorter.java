package sorter;

abstract public class AbstractSorter implements Sorter {
    Sorter sorter;

    public AbstractSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    @Override
    abstract public void sort();
}
