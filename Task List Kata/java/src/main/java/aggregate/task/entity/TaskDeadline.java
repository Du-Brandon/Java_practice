package aggregate.task.entity;

import java.time.LocalDate;

public class TaskDeadline {
    private LocalDate deadLine;

    TaskDeadline(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }
}
