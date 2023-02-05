//  В первый день спортсмен пробежал s километров, а затем он каждый день увеличивал пробег на 10 % от предыдущего значения. 
//  По данному числу y определите номер дня, на который пробег спортсмена составит не менее target километров.
//  Программа получает на вход действительные числа s и target и должна вывести одно натуральное число.

import java.io.*;

public class Homework_14_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int s = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());

        int y = 0;
        while (s <= target){
            s+=s*0.1;
            y++;
        }
        System.out.println(y);
    }
}
