//  Даны три целых числа.
//  Определите, сколько среди них совпадающих.
//  Программа должна вывести одно из чисел:
//  3 (если все совпадают),
//  2 (если два совпадает) или
//  0 (если все числа различны).

import java.io.*;

public class Homework_19_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 3 любых числа: ");

        int number1 = Integer.parseInt(br.readLine());
        int number2 = Integer.parseInt(br.readLine());
        int number3 = Integer.parseInt(br.readLine());

        coincidence(number1, number2, number3);

    }
    public static void coincidence (int number1, int number2, int number3){
        if(number1 == number2 && number1 == number3){
            System.out.println(3);
        } else if (number1 == number2 || number1 == number3 || number2 == number3){
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}
