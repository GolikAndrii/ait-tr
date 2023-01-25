//  Напишите программу, которая читает строку, и выводит её длину, первый и последний символы.
import java.io.*;

public class Homework_7_1{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите любой текст: ");
        String text = br.readLine();

        int textLength = text.length();
        System.out.printf("В данной строке всего символов: %d%n", textLength);

        char firstElement = text.charAt(0);
        char lastElement = text.charAt(textLength-1);

        System.out.printf("Первый символ - '%s'%n", firstElement);
        System.out.printf("Последний символ - '%s'%n", lastElement);
    }
}

//  Введите любой текст: I want to be FullStack Developer!
//  В данной строке всего символов: 33
//  Первый символ - 'I'
//  Последний символ - '!'
