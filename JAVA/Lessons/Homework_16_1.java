//  На вход программе подается натуральное число n. Напишите программу,
//  которая выводит числа от 1 до n включительно за исключением чисел от 5 до 19 включительно.
import java.io.*;

public class Homework_16_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i=1; i<=n; ++i){
            if((i>=5) && (i<=19)){
                continue;
            }
            System.out.println(i);
        }
    }
}
