package day12_map.AdvancedMaps;

import java.util.EnumMap;
import java.util.Map;

enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY
}

public class EnumMapDemo {

    public static void main(String[] args) {

        EnumMap<Day, String> workSchedule = new EnumMap<>(Day.class);

        workSchedule.put(Day.MONDAY, "Team Meeting");
        workSchedule.put(Day.TUESDAY, "Coding");
        workSchedule.put(Day.WEDNESDAY, "Testing");
        workSchedule.put(Day.THURSDAY, "Code Review");
        workSchedule.put(Day.FRIDAY, "Deployment");

        System.out.println(workSchedule);
        
        for (Map.Entry<Day, String> entry : workSchedule.entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}