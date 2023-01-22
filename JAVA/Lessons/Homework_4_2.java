import java.io.*;

public class Homework_4_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Программа вычисления скорости автомобиля.");
        System.out.print("Введите расстояние, которое проехал автомобиль в киллометрах: ");
        double length  = Double.parseDouble(br.readLine());
        System.out.print("Введите время, которое затратил автомобиль, чтобы проехать "+length+" киллометров в часах: ");
        double time  = Double.parseDouble(br.readLine());
        double speed = length / time;
        System.out.println("________________________________________");
        System.out.println("Скорость автомобиля составила " + speed +" км/ч!");
    }
}