package modules;

import java.util.Objects;

public abstract class Task {
    protected String taskId;
    protected String description;

    public Task(String id, String desc) {
        this.taskId = id;
        this.description = desc;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return taskId + ' ' + description;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTaskId(), getdescription());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Task)) {
            return false;
        }
        Task task = (Task) o;

        return Objects.equals(this.getTaskId(), task.getTaskId()) && Objects.equals(this.getdescription(), task.getdescription());
    }

    public abstract void execute();

}