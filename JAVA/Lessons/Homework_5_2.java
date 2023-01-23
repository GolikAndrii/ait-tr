//Написать программу, которая считывает с клавиатуры пять символов и выводит их коды.

import java.io.*;
public class Homework_5_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        System.out.println("Введите 5 любых символов на клавиатуре: ");
      
        int symbol_1 = (br.read());
        int symbol_2 = (br.read());
        int symbol_3 = (br.read());
        int symbol_4 = (br.read());
        int symbol_5 = (br.read());
      
        System.out.println("");
        System.out.println("Вот коды данных символов: ");
        System.out.println("_____________________________");
        System.out.println("Символу '" +(char)symbol_1+ "' соответствует код: " +symbol_1);
        System.out.println("Символу '" +(char)symbol_2+ "' соответствует код: " +symbol_2);
        System.out.println("Символу '" +(char)symbol_3+ "' соответствует код: " +symbol_3);
        System.out.println("Символу '" +(char)symbol_4+ "' соответствует код: " +symbol_4);
        System.out.println("Символу '" +(char)symbol_5+ "' соответствует код: " +symbol_5);
    }
}
