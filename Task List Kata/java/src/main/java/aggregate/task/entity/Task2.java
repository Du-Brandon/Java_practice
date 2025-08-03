package aggregate.task.entity;

public class Task2 {
    private final TaskId id;
    private final TaskDescription description;
    private final TaskDeadline deadline;
    private final TaskDone done;

    public Task2(long id, String description, boolean done) {
        this.id = new TaskId(id);
        this.description = new TaskDescription(description);
        this.deadline = null;
        this.done = new TaskDone(done);
    }

    public long getId() {
        return id.getId();
    }

    public String getDescription() {
        return description.getDescription();
    }

    public boolean isDone() {
        return done.isDone();
    }

    public void setDone(boolean done) {
        this.done.setDone(done);
    }

}
