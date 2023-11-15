import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MicroWave {
    int duration;
    List<Programa> programaList = new ArrayList<>();
    public MicroWave(int duration){
        this.duration = duration;
    }

    public void setProgram(int number){
        Programa program = null;
        for(Programa program2: programaList){
            if (program2.number == number){
                program = program2;
            }
        }
        int count = 0;
        LocalTime programEnd = LocalTime.now();
        programEnd = programEnd.plusSeconds(program.duration);
        while (LocalTime.now().isBefore(programEnd)){
            if (count == 100 || count == 1000 || count == 10000){
                System.out.println("Se prepara");
                count++;
            }
        }
    }
    public void start(){
        LocalTime endTime = LocalTime.now().plusSeconds(duration);
        while(LocalTime.now().isBefore(endTime)){
            System.out.println("Se prepara");
        }
    }
    public void addProgram(Programa program){
        programaList.add(program);
    }
    public void displayPrograms(){
        for (Programa program: programaList){
            System.out.println("Numar: " + program.getNumber());
            System.out.println("Name: " +program.getName());
            System.out.println("Duration in seconds: " + program.getDuration());
        }
    }
}
