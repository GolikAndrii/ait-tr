// Заданы две клетки шахматной доски. Напишите программу, которая определяет имеют ли указанные клетки один цвет или нет. 
// Если они покрашены в один цвет, то выведите слово «YES», а если в разные цвета — то «NO».
// Формат входных данных
// На вход программе подаётся четыре числа от 1 до 8 каждое, задающие номер столбца и номер строки сначала для первой клетки, потом для второй клетки.
// Формат выходных данных
// Программа должна вывести текст в соответствии с условием задачи.

import java.io.*;

public class Homework_14_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x1 = Integer.parseInt(br.readLine());
        int y1 = Integer.parseInt(br.readLine());
        int x2 = Integer.parseInt(br.readLine());
        int y2 = Integer.parseInt(br.readLine());

        if (((x1+y1) + (x2+y2)) %2 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
