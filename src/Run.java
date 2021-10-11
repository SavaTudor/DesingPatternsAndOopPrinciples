import modules.MessageTask;
import modules.Task;

import java.time.LocalDateTime;

public class Run {
    public static MessageTask[] createMessageTaskArray() {
        MessageTask t1 = new MessageTask("1", "test1", "salut", "mine", "tine", LocalDateTime.now());
        MessageTask t2 = new MessageTask("2", "test2", "ce faci?", "Tudor", "Bogdan", LocalDateTime.now());
        MessageTask t3 = new MessageTask("3", "test3", "pa", "Bogdan", "Tudor", LocalDateTime.now());
        return new MessageTask[]{t1, t2, t3};
    }

    public static void main(String[] args) {
        MessageTask[] array = createMessageTaskArray();
        for(MessageTask m:array){
            m.execute();
        }
    }
}

