import java.io.*;

public class Homework_17_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        int sumOdd = 0;
        int sumEven = 0;

        for (int i=0; i<n; ++i){
            array[i] = Integer.parseInt(br.readLine());
        }
        for (int i=0; i<n; ++i){

            if (!(array[i]%2 ==0)){
                sumOdd += array[i];
            }

            if (array[i]%2 ==0){
                sumEven += array[i];
            }
        }
        System.out.println(sumOdd);
        System.out.println(sumEven);

        if(sumOdd > sumEven){
            System.out.println("нечетная");
        } else {
            System.out.println("четная");
        }
    }
}
