//  Напишите программу, в которой пользователь вводит с клавиатуры целое число, а программа ему рассказывает,
//  отрицательное это число, положительное или ноль, и делится ли оно на три.
//  Использовать if ... else и из трёх вариантов (отрицательное, положительное или ноль) вывести только один.

import java.io.*;

public class Homework_9_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите любое целое число: ");
        int number = Integer.parseInt(br.readLine());
        int isDivisionThree = number % 3;

        if (number > 0) {
            if (isDivisionThree == 0) {
                System.out.println("Это число ПОЛОЖИТЕЛЬНОЕ и оно делится на 3");
            } else {
                System.out.println("Это число ПОЛОЖИТЕЛЬНОЕ и оно НЕ делится на 3");
            }
        } else if (number < 0) {
            if (isDivisionThree == 0) {
                System.out.println("Это число ОТРИЦАТЕЛЬНОЕ и оно делится на 3");
            } else {
                System.out.println("Это число ОТРИЦАТЕЛЬНОЕ и оно НЕ делится на 3");
            }
        } else {
            System.out.println("Это число НОЛЬ");
        }
    }
}
