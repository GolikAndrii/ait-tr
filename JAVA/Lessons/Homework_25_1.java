import java.io.*;
import java.util.*;

public class Homework_25_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int setNumber = Integer.parseInt(br.readLine());


        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < setNumber; ++i) {
            int number = Integer.parseInt(br.readLine());
            numbers.add(number);
            if(number > 10){
                numbers.remove(number);
            }
        }
        System.out.println(numbers);
    }
}
