package containers;

import modules.Task;

import static utils.Constants.INITIAL_CONTAINER_SIZE;


/*
5.3 - Refactorizati clasele StackContainer si QueueContainer
astfel incat sa evitati codul duplicat
 */
public abstract class AbstractContainer implements Container {
    protected Task[] tasks;
    protected int size;

    public AbstractContainer() {
        this.tasks = new Task[INITIAL_CONTAINER_SIZE];
        this.size = 0;
    }

    abstract public Task remove();

    @Override
    public void add(Task task) {
        int len = tasks.length;
        if (len == size) {
            Task[] t = new Task[len * 2];
            System.arraycopy(tasks, 0, t, 0, len);
            tasks = t;
        }
        tasks[size] = task;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
