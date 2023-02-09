import java.io.*;

public class Homework_17_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        for (int i=0; i<n; ++i){
            array[i] = Integer.parseInt(br.readLine());
        }
        for (int i=0; i<n; ++i){
            if (!(array[i]%2 ==0)){
                System.out.println(array[i]);
            }
        }
    }
}
