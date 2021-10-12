import containers.Strategy;
import modules.MessageTask;
import modules.SortingTask;
import modules.Task;
import runner.DelayTaskRunner;
import runner.PrinterTaskRunner;
import runner.StrategyTaskRunner;
import runner.TaskRunner;
import sorter.BubbleSorter;
import sorter.Sorter;
import sorter.SortingStrategy;
import utils.Order;
import utils.sort.BubbleSort;
import utils.sort.QuickSort;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Run {
    public static MessageTask[] createMessageTaskArray() {
        MessageTask t1 = new MessageTask("1", "test1", "salut", "mine", "tine", LocalDateTime.now());
        MessageTask t2 = new MessageTask("2", "test2", "ce faci?", "Tudor", "Bogdan", LocalDateTime.now());
        MessageTask t3 = new MessageTask("3", "test3", "pa", "Bogdan", "Tudor", LocalDateTime.now());
        MessageTask t4 = new MessageTask("4", "test4", "ciocolata", "Dani", "Florin", LocalDateTime.now());
        MessageTask t5 = new MessageTask("5", "test5", "sa fie binele", "Juve", "Sorinel", LocalDateTime.now());
        return new MessageTask[]{t1, t2, t3, t4, t5};
    }

    public static void main(String[] args) {
//        runStrategyTaskRunner();
//        runPrinterTaskRunner();
//        runSorterTask();
        runDelayTaskRunner();
    }

    private static void runStrategyTaskRunner() {
        MessageTask[] array = createMessageTaskArray();

        for (MessageTask m : array) {
            m.execute();
        }
        StrategyTaskRunner strategyTaskRunner = new StrategyTaskRunner(Strategy.LIFO);
        strategyTaskRunner.addTask(array[0]);
        strategyTaskRunner.addTask(array[1]);
        strategyTaskRunner.executeAll();
    }

    private static void runPrinterTaskRunner() {
        final MessageTask[] messageTasks = createMessageTaskArray();
        final StrategyTaskRunner strategyTaskRunner = new StrategyTaskRunner(Strategy.LIFO);

        for (Task task : messageTasks) {
            strategyTaskRunner.addTask(task);
        }
        final PrinterTaskRunner printerTaskRunner = new PrinterTaskRunner(strategyTaskRunner);
        printerTaskRunner.executeAll();
    }

    /*3. Derivați clasa SortingTask din Task care sortează un vector de numere întregi si afiseaza vectorul sortat,
     via metoda execute()
     */
    private static void runSorterTask() {
        int[] array = {1, 10, 7, 6, 5, 0, 7, 8, 5, 5};
        SortingTask task = new SortingTask("10", "sortare", array, SortingStrategy.QUICK_SORT);
        task.execute();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /*
    12.2 - Extindeţi clasa AbstractTaskRunner astfel:
            DelayTaskRunner – care execută taskurile cu întârziere
     */
    private static void runDelayTaskRunner() {
        final MessageTask[] messageTasks = createMessageTaskArray();
        StrategyTaskRunner strategyTaskRunner;
        Scanner myObj = new Scanner(System.in);

        String strategy = myObj.nextLine();
        if (strategy.equals("LIFO")) {
            strategyTaskRunner = new StrategyTaskRunner(Strategy.LIFO);
        } else {
            strategyTaskRunner = new StrategyTaskRunner(Strategy.FIFO);
        }
        for (Task task : messageTasks) {
            strategyTaskRunner.addTask(task);
        }
        final DelayTaskRunner delayTaskRunner = new DelayTaskRunner(strategyTaskRunner);
        delayTaskRunner.executeAll();
    }

}

