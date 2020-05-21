package data;

import java.util.Comparator;

public class Participant{
    private String name;
    private String nick;
    private int result;


    public Participant(String name, String nick, int result) {
        this.name = name;
        this.nick = nick;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", nick='" + nick + '\'' +
                ", result=" + result +
                '}';
    }

}
