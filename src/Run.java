import containers.Strategy;
import modules.MessageTask;
import modules.Task;
import runner.PrinterTaskRunner;
import runner.StrategyTaskRunner;
import runner.TaskRunner;

import java.time.LocalDateTime;

public class Run {
    public static MessageTask[] createMessageTaskArray() {
        MessageTask t1 = new MessageTask("1", "test1", "salut", "mine", "tine", LocalDateTime.now());
        MessageTask t2 = new MessageTask("2", "test2", "ce faci?", "Tudor", "Bogdan", LocalDateTime.now());
        MessageTask t3 = new MessageTask("3", "test3", "pa", "Bogdan", "Tudor", LocalDateTime.now());
        return new MessageTask[]{t1, t2, t3};
    }

    public static void main(String[] args) {
        /*MessageTask[] array = createMessageTaskArray();

        for(MessageTask m:array){
            m.execute();
        }
        StrategyTaskRunner strategyTaskRunner = new StrategyTaskRunner(Strategy.LIFO);
        strategyTaskRunner.addTask(array[0]);
        strategyTaskRunner.addTask(array[1]);
        strategyTaskRunner.executeAll();

         */
        runPrinterTaskRunner();
    }

    private static void runPrinterTaskRunner(){
        final MessageTask[] messageTasks = createMessageTaskArray();
        final StrategyTaskRunner strategyTaskRunner = new StrategyTaskRunner(Strategy.LIFO);

        for (Task task:messageTasks){
            strategyTaskRunner.addTask(task);
        }
        final PrinterTaskRunner printerTaskRunner = new PrinterTaskRunner(strategyTaskRunner);
        printerTaskRunner.executeAll();
    }
}

