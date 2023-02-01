//  Написать программу, в которую вводится имя и фамилия пользователя в одну строку через пробел.
//  Программа должна выводить имя и фамилию на разных строках.

import java.io.*;

public class Homework_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите имя и фамилию через пробел: ");
        String source = br.readLine();
        int space = source.indexOf(' ');

        if(space !=-1){
            String name = source.substring(0, space);
            String lastName = source.substring(space+1);

            System.out.println(name);
            System.out.println(lastName);
        } else {
            System.out.println("Вы ввели Имя и Фамилию слитно. Попробуйте еще раз ;-)");
        }
    }
}
