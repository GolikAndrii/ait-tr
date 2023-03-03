import Homework_32.Homework_32_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
public class Homework_33 {

    enum Season{
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER,
    }

    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER,
    }

    public static Map<Month, Integer> buildMonthsMap() {
        Map<Month, Integer> months = new HashMap<>();

        months.put(Month.JANUARY, 31);
        months.put(Month.FEBRUARY, 28);
        months.put(Month.MARCH, 31);
        months.put(Month.APRIL, 30);
        months.put(Month.MAY, 31);
        months.put(Month.JUNE, 30);
        months.put(Month.JULY, 31);
        months.put(Month.AUGUST, 31);
        months.put(Month.SEPTEMBER, 30);
        months.put(Month.OCTOBER, 31);
        months.put(Month.NOVEMBER, 30);
        months.put(Month.DECEMBER, 31);

        return months;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the month: ");
        String month = inputReader.readLine();
        Month monthToLook = Month.valueOf(month.toUpperCase());


        Map<Month, Integer> monthDays = buildMonthsMap();

        if (monthDays.containsKey(monthToLook)) {
            System.out.printf("The month '%s' contains %d days%n", month, monthDays.get(monthToLook));
            System.out.printf("The month '%s' has ordinal number %d%n", month, monthToLook.ordinal() + 1);

            switch (monthToLook.ordinal()) {
                case 0, 1, 11 -> System.out.println("This month belongs to " + Season.WINTER);
                case 2, 3, 4 -> System.out.println("This month belongs to " + Season.SPRING);
                case 5, 6, 7 -> System.out.println("This month belongs to " + Season.SUMMER);
                default -> System.out.println("This month belongs to " + Season.AUTUMN);
            }

            int nextMonthIndex = (monthToLook.ordinal() + 1);
            Month nextMonth = Month.values()[nextMonthIndex % Month.values().length];

            System.out.printf("The next month is '%s'%n", nextMonth);
            System.out.printf("It has %d days", monthDays.get(nextMonth));

        } else {
            System.out.println("No such month: " + month);
        }
    }

}
