import java.io.*;

public class Homework_7_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите 5 любых символов на клавиатуре: ");

        int symbol_1 = (br.read());
        int symbol_2 = (br.read());
        int symbol_3 = (br.read());
        int symbol_4 = (br.read());
        int symbol_5 = (br.read());

        System.out.println("");
        System.out.println("Вот коды данных символов: ");
        System.out.println("_____________________________");
        System.out.printf("Символу '%s' соответствует код: %s%n", (char)symbol_1, symbol_1);
        System.out.printf("Символу '%s' соответствует код: %s%n", (char)symbol_2, symbol_2);
        System.out.printf("Символу '%s' соответствует код: %s%n", (char)symbol_3, symbol_3);
        System.out.printf("Символу '%s' соответствует код: %s%n", (char)symbol_4, symbol_4);
        System.out.printf("Символу '%s' соответствует код: %s%n", (char)symbol_5, symbol_5);

    }
}
