import java.io.*;

public class Homework_18_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String string = br.readLine();
        int number = Integer.parseInt(br.readLine());

        repeatLine(string, number);
    }
    public static void repeatLine (String string, int number){
        for (int i = 0; i<number; ++i){
            System.out.print(string + " ");
        }
    }
}
