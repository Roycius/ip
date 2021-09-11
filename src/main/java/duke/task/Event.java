package duke.task;

public class Event extends Task {
    protected String at;

    public Event(String descr, String at) {
        super(descr);
        this.at = at;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + at + ")";
    }
}
