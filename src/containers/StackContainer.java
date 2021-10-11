package containers;

import modules.Task;

import static utils.Constants.INITIAL_STACK_SIZE;

public class StackContainer implements Container {

    private Task[] tasks;
    private int size;

    public StackContainer() {
        tasks = new Task[INITIAL_STACK_SIZE];
        size = 0;
    }

    @Override
    public Task remove() {
        if (!isEmpty()) {
            size--;
            return tasks[size];
        }
        return null;
    }

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
