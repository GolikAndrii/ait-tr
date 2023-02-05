//  Программа получает на вход строку и число повторений этой строки и должна вывести эту же строку нужно количество раз.
//  Формат входных данных
//  На вход программе подается две строки:
//  строка, которую нужно повторять;
//  натуральное число - количество повторений.
//  Формат выходных данных
//  Программа должна вывести нужное количество одинаковых строк.

import java.io.*;

public class Homework_14_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String string = br.readLine();
        int count = Integer.parseInt(br.readLine());

        int i=0;
        while (i < count){
            System.out.println(string);
            i++;
        }
    }
}
