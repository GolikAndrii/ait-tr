import java.io.*;

public class Homework_13_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int column1 = Integer.parseInt(br.readLine());
        int row1 = Integer.parseInt(br.readLine());
        int column2 = Integer.parseInt(br.readLine());
        int row2 = Integer.parseInt(br.readLine());

        if(Math.abs(column2 - column1) > 1){
            System.out.println("NO");
        } else if (Math.abs(row2 - row1) > 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
