//  Напишите программу, в которой пользователь вводит с клавиатуры целое число, а программа ему рассказывает,
//  отрицательное это число, положительное или нулевое, и делится ли оно на три.

import java.io.*;

public class Homework_8_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите любое целое число: ");
        String line = br.readLine();
        int number = Integer.parseInt(line);
        System.out.printf("Число %d является отрицательным: %b%n", number, number < 0);
        System.out.printf("Число %d является положительным: %b%n", number, number > 0);
        System.out.printf("Число %d является нулевым: %b%n", number, number == 0);
        System.out.printf("Число %d делится на 3 без остатка: %b%n", number, (number % 3) == 0);
    }
}

//  Введите любое целое число: 99
//  Число 99 является отрицательным: false
//  Число 99 является положительным: true
//  Число 99 является нулевым: false
//  Число 99 делится на 3 без остатка: true
