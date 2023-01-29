import java.io.*;

public class Homework_9_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите любое число в диапазоне 0 - 999: ");
        int number = Integer.parseInt(br.readLine());


//  Стражник номер РАЗ ;-)
        if (number < 0) {
            System.out.println("Это отрицательное число. Введите число в диапазоне 0 - 999");
            return;
        }
//  Стражник номер ДВА ;-)
        if (number > 999) {
            System.out.println("Это очень большое число. Введите число в диапазоне 0 - 999");
            return;
        }
// Элегантное решение
//        int numberCount = String.valueOf(number).length();
//        System.out.printf("Вы ввели число %d%n", number);
//        System.out.printf("В этом числе %d цифры(а)" , numberCount);

// Решение через if...else как в задании

        int numberCount = String.valueOf(number).length();
        System.out.printf("Вы ввели число %d%n", number);

        if (numberCount == 1){
            System.out.printf("Число %d состоит из %d цифры." , number, numberCount);
        } else if (numberCount == 2){
            System.out.printf("Число %d состоит из %d цифр." , number, numberCount);
        } else {
            System.out.printf("Число %d состоит из %d цифр." , number, numberCount);
        }
    }
}
