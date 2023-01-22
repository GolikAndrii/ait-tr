import java.io.*;

public class Homework_4_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Программа для вычисления средней стомости поездки по проездному.");
        System.out.print("Введите стоимость проездного на месяц: ");
        double priceMonth  = Double.parseDouble(br.readLine());
        System.out.print("Введите количество рабочих дней в месяц: ");
        double daysMonth  = Double.parseDouble(br.readLine());

        double quantityTrips = daysMonth * 2;
        //  "и 1.5 поездки в выходной". В задаче не указано количество выходных. Принимаю по default 8 выходных (4 недели)
        double quantityWeekendTrips = 8*1.5;

        int sumTrips = (int)(quantityTrips + quantityWeekendTrips);
        double averagePriceTrip = priceMonth / sumTrips;

        String roundOff = String.format("%.2f", averagePriceTrip); // для корректного отображения стоимости выводим в формате '0.00'. Т.е. обрезаем после 2-го знака

        System.out.println("________________________________________________");
        System.out.println("Общее число поезок в месяц (с учетом выходных): " + sumTrips);
        System.out.println("Средняя стоимость одной поездки по проездному: " + roundOff);


    }
}