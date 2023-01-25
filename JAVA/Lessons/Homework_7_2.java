//  Напишите программу, которая читает строку, левый индекс и правый индекс и выводит получившуюся подстроку.
import java.io.*;

public class Homework_7_2{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите любой текст: ");
        String text = br.readLine();

        int textLength = text.length();
        System.out.printf("В данной строке всего символов: %s%n", textLength);
        String newText = text.substring(0, textLength);

       System.out.printf("Левый индекс  - '%s'%n", 0);
       System.out.printf("Правый индекс - '%s'%n", textLength-1);
       System.out.printf("Новая подстрока  - '%s'%n", newText);

    }
}
//  Введите любой текст: I want to be FullStack Developer!
//  В данной строке всего символов: 33
//  Левый индекс  - '0'
//  Правый индекс - '32'
//  Новая подстрока  - 'I want to be FullStack Developer!'
