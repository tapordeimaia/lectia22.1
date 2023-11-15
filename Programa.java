import java.time.LocalTime;

public class Programa { ;
    int duration;
    String name;
    int number;

    public Programa( int duration, String name, int number) {
        this.duration = duration;
        this.name = name;
        this.number = number;
    }
    public Programa(String name, int number) {
        this.name = name;
        this.number = number;
    }
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
