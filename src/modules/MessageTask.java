package modules;

import java.time.LocalDateTime;

import static utils.Constants.DATE_TIME_FORMATTER;

public class MessageTask extends Task {
    private String mesaj;
    private String from;
    private String to;
    private LocalDateTime date;

    public MessageTask(String id, String desc, String m, String f, String t, LocalDateTime d) {
        super(id, desc);
        this.mesaj = m;
        this.from = f;
        this.to = t;
        this.date = d;
    }

    @Override
    public void execute() {
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.mesaj + " " + from + " " + to + " " + date.format(DATE_TIME_FORMATTER);
    }
}
