/*
//Обновить программу для вычисления площади прямоугольника. Добавить вывод единиц измерения через символ Unicode.

import java.io.*;
public class MyClass {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Программа вычисления площади прямоугольника");
        System.out.print("Введите длину прямоугольника в см.: ");
        int length  = Integer.parseInt(br.readLine());
        System.out.print("Введите ширину прямоугольника в см.: ");
        int width  = Integer.parseInt(br.readLine());
        int square = length * width;
        System.out.println("________________________________________");
        System.out.println("Площадь прямоугольника со сторонами " + length + "см. и " + width + "см. равна: " + square + " см"+'\u00B2' );
    }
}
*/
