//  Всем известно, что ведьмак способен одолеть любых чудовищ, однако его услуги обойдутся недешево, к тому же ведьмак не принимает купюры, 
//  он принимает только чеканные монеты. 
//  В мире ведьмака существуют монеты с номиналами 1, 5, 10, 25.
//  Напишите программу, которая определяет, какое минимальное количество чеканных монет нужно заплатить ведьмаку.
//  Формат входных данных
//  На вход программе подается одно натуральное число, цена за услугу ведьмака.
//  Формат выходных данных
//  Программа должна вывести минимально возможное количество чеканных монет для оплаты.


import java.io.*;

public class Homework_14_3 {
    final public static int COIN_1 = 1;
    final public static int COIN_5 = 5;
    final public static int COIN_10 = 10;
    final public static int COIN_25 = 25;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        if(count%COIN_25 == 0){
            System.out.println(count/COIN_25);
        } else if(count%COIN_10 == 0 ){
            System.out.println(count/COIN_25 + count%COIN_25/COIN_10);
        } else if (count%COIN_5 == 0) {
            System.out.println(count/COIN_25 + count%COIN_25/COIN_10 + count%COIN_10/COIN_5);
        } else {
            System.out.println(count/COIN_25 + count%COIN_25/COIN_10 + count%COIN_10/COIN_5 + count%COIN_5/COIN_1);
        }
    }
}
