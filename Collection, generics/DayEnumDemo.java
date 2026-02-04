/* Create an enum called Day that represents the days of the 
week. Write a program that prints out all the days of the 
week from this enum. */

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class DayEnumDemo {

    public static void main(String[] args) {

        System.out.println("Days of the Week:");
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
