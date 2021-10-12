package factory;

import containers.Container;
import containers.QueueContainer;
import containers.StackContainer;
import containers.Strategy;


/*
7 -  Implementati clasa TaskContainerFactory care implementeaza interfata Factory, astfel incat sa nu poata exista decat
  o singura instanta de acest tip.
 */
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
        return new QueueContainer();
    }
}
