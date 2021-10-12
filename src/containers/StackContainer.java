package containers;

import modules.Task;

import static utils.Constants.INITIAL_CONTAINER_SIZE;

public class StackContainer extends AbstractContainer {

    public StackContainer() {
        super();
    }

    @Override
    public Task remove() {
        if (!isEmpty()) {
            size--;
            return tasks[size];
        }
        return null;
    }

}
