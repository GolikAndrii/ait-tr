// На вход программе подается натуральное число n - количество чисел, а затем и сами числа, каждое с новой строки.
// Напишите программу, которая прочитает эти числа, сохранит в список, а затем выведет только чётные элементы списка.

import java.io.*;
import java.util.*;

public class Homework_22_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            numbers.add(Integer.parseInt(br.readLine()));
        }
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
