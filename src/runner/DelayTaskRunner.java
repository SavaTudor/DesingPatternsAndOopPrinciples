package runner;

import containers.Container;
import containers.Strategy;
import factory.TaskContainerFactory;

public class DelayTaskRunner extends AbstractTaskRunner {

    public DelayTaskRunner(TaskRunner taskRunner) {
        super(taskRunner);
    }

    @Override
    public void executeOneTask() {
        this.taskRunner.executeOneTask();
        decoratedExecuteOneTask();
    }

    private void decoratedExecuteOneTask() {
        try {
            System.out.println("Waiting...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
