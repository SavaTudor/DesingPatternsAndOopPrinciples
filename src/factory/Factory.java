package factory;

import containers.Container;
import containers.Strategy;

public interface Factory {
    Container createContainer(Strategy strategy);
}
