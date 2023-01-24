import java.io.*;
import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Homework_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
        String todayDate = formatDate.format(new Date());

        DateTimeFormatter formatOfDate = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Привет! Сейчас я расскажу Вам сколько дней Вы уже прожили.");
        System.out.println("Но сначала скажите как Ваше имя");
        String userName = br.readLine();
        String name = userName;

        System.out.println("Укажите дату своего дня рождения в формате '01.01.1993'");
        String dateOfBirth = br.readLine();

        LocalDate startDate = LocalDate.parse(dateOfBirth, formatOfDate);
        LocalDate endDate = LocalDate.parse(todayDate, formatOfDate);
        Period period = Period.between(startDate, endDate);

        int minutesInYear = period.getYears()*365*24*60*60;
        int minutesInMonth = period.getMonths()*30*24*60*60;
        int minutesInDay = period.getDays()*24*60*60;

        System.out.println("Итак. Вы прожили: ");
        System.out.println("Полных лет: "+ period.getYears());
        System.out.println("Месяцев: " +period.getMonths());
        System.out.println("И " + period.getDays() + " дней!");
        System.out.println("___________________________________________");

        System.out.println("Всего это целых " + (minutesInYear+minutesInMonth+minutesInDay)/60/60/24 + " дней!");
        System.out.println("И аж " + (minutesInYear+minutesInMonth+minutesInDay)/60 + " минут жизни!");
        System.out.println("___________________________________________");
        System.out.println("И помните, "+ name + ", что жизнь одна - цените её!");
    }
}
