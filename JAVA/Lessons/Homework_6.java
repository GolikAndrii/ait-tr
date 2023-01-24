//  Напишите программу, которая считывает три числа и выводит их сумму. Каждое число записано в отдельной строке.
import java.io.*;

public class Homework_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите первое число: ");
        int one = Integer.parseInt(br.readLine());

        System.out.print("Введите второе число: ");
        int two = Integer.parseInt(br.readLine());

        System.out.print("Введите третье число: ");
        int three = Integer.parseInt(br.readLine());

        int sum = one+two+three;

        System.out.println("__________________________________________");
        System.out.println("Сумма чисел "+one + ", " +two+ " и " +three +" равна: " + sum);
    }
}
