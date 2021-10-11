package runner;

import utils.Constants;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class PrinterTaskRunner extends AbstractTaskRunner{
    public PrinterTaskRunner(TaskRunner taskRunner) {
        super(taskRunner);
    }

    @Override
    public void executeOneTask() {
        this.taskRunner.executeOneTask();
        decoratedExecuteOneTask();
    }

    private void decoratedExecuteOneTask(){
        System.out.println("Task executed at: " + LocalDateTime.now().format(Constants.DATE_TIME_FORMATTER));
    }
}
