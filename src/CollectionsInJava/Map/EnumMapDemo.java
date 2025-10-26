package CollectionsInJava.Map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {

        Map<Day,String> enumMap = new EnumMap<>(Day.class); // jaise hi hum mention krenge constructor me ki konsa enum type h vaise hi size define hojaaega --> no. of enum constants
        enumMap.put(Day.TUESDAY,"Seminar");
        enumMap.put(Day.MONDAY,"Meeting");
        String s = enumMap.get(Day.TUESDAY);
        System.out.println(s);
        System.out.println(enumMap);
        System.out.println(Day.TUESDAY.ordinal());


    }
}
enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY,SUNDAY
}