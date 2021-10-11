package factory;

import containers.Container;
import containers.Strategy;

public interface Factory {
    public Container createContainer(Strategy strategy);
}
