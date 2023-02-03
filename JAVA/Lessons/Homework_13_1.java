import java.io.*;

public class Homework_13_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int firstNumber = Integer.parseInt(br.readLine());
        int secondNumber = Integer.parseInt(br.readLine());
        int thirdNumber = Integer.parseInt(br.readLine());

        if((firstNumber < secondNumber+thirdNumber) && (secondNumber < firstNumber+thirdNumber) && (thirdNumber < firstNumber+secondNumber)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
