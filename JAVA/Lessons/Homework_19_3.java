//  Шоколадка имеет вид прямоугольника, разделенного на n×m долек.
//  Шоколадку можно один раз разломить по прямой на две части.
//  Определите, можно ли таким образом отломить от шоколадки часть, состоящую ровно из k долек.
//  Программа получает на вход три числа: n, m, k и должна вывести YES или NO.

import java.io.*;

public class Homework_19_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        if((k < n * m) && (k % n == 0) || (k % m == 0)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
