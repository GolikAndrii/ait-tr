// Дано натуральное число n. Напишите программу, которая выводит таблицу умножения на n.

public class Homework_15_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i<=10; ++i){
            int sum = n*i;
            System.out.printf("%d x %d = %d%n", n, i, sum);
        }
    }
}
