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

    public static void main(String[] args) {

    }

}
