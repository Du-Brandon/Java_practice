package aggregate.task.entity;

public class TaskDone {
    private boolean done;

    TaskDone(boolean done) {
        this.done = done;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
