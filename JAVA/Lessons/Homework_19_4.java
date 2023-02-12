//  Шахматный конь ходит буквой “Г” — на две клетки по вертикали в любом направлении и на одну клетку по горизонтали, или наоборот.
//  Даны две различные клетки шахматной доски, определите, может ли конь попасть с первой клетки на вторую одним ходом.

import java.io.*;

public class Homework_19_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a1 = Integer.parseInt(br.readLine());
        int b1 = Integer.parseInt(br.readLine());
        int a2 = Integer.parseInt(br.readLine());
        int b2 = Integer.parseInt(br.readLine());

        int differenceA = Math.abs(a1-a2);
        int differenceB = Math.abs(b1-b2);

        if((differenceA == 1 && differenceB == 2) || (differenceA == 2 && differenceB == 1)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
