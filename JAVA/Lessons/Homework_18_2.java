// p=m*g
import java.io.*;

public class Homework_18_2 {
    public static void main(String[] args) throws IOException {
        final double GRAVITY  = 0.17;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int weight = Integer.parseInt(br.readLine());
        getWeight(weight, GRAVITY);
    }
    public static void getWeight (int weight, double gravity){
        System.out.printf("%.2f", weight * gravity);
    }
}
