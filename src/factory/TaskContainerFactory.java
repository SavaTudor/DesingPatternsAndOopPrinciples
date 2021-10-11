package factory;

import containers.Container;
import containers.StackContainer;
import containers.Strategy;

public class TaskContainerFactory implements Factory {
    private static TaskContainerFactory instance = null;

    private TaskContainerFactory(){

    }

    public static TaskContainerFactory getInstance(){
        if (instance==null){
            instance = new TaskContainerFactory();
        }
        return instance;
    }

    @Override
    public Container createContainer(Strategy strategy) {
        if (strategy == Strategy.LIFO) {
            return new StackContainer();
        }
        return null;
    }
}
