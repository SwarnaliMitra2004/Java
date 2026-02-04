/* Enhance the Day enum by adding an attribute that 
indicates whether it is a weekday or weekend. Add a 
method in the enum that returns whether it's a weekday or 
weekend, and write a program to print out each day along 
with its type. */

enum Day {

    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    // true = weekday, false = weekend
    private final boolean isWeekday;

    // Enum constructor
    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    // Method to check day type
    public String getDayType() {
        return isWeekday ? "Weekday" : "Weekend";
    }
}

public class DayEnumEnhanced {

    public static void main(String[] args) {

        for (Day day : Day.values()) {
            System.out.println(day + " : " + day.getDayType());
        }
    }
}
