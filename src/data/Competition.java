package data;

import java.util.*;

public class Competition {
    private String Name;
    private String date;
    private List<Participant> participants;

    public Competition(String name, String date, List<Participant> participants) {
        Name = name;
        this.date = date;
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Competition{" +
                "Name='" + Name + '\'' +
                ", date='" + date + '\'' +
                ", participants=" + participants +
                '}';
    }
}
