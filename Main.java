import java.time.*;
public class Main {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());
//        LocalDate localDate = LocalDate.of(2021, Month.APRIL, 20);
//        LocalTime localTime = LocalTime.of(3, 39);
//        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
//
//        ZoneId zoneId = ZoneId.of("US/Eastern");
//        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime, zoneId);
//        System.out.println(zonedDateTime);
//
//        System.out.println(localDateTime.getMinute());
//        System.out.println(zonedDateTime.getOffset().getTotalSeconds());
//
//        if(localTime.now().isAfter(localTime)){
//            //yey
//        }
//
//        localTime.withHour(2).withMinute(20).withSecond(56);
//        Programa program1 = new Programa(3, "Program1", 1);
//        MicroWave microWave = new MicroWave();
//        microWave.addProgram(program1);
//        microWave.displayPrograms();
//        microWave.setProgram(1);

        MicroWave microWave = new MicroWave(3);
        microWave.start();
    }
}