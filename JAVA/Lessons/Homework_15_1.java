// Даны два целых числа: m и n (m > n). Напишите программу, которая выводит все нечётные числа от m до n включительно в порядке убывания.

import java.io.*;

public class Homework_15_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        for(; n<=m; --m){
            if (!(m%2==0)){
                System.out.println(m);
            }
        }
    }
}
