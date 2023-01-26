//  Перепишите домашнюю работу про символы (задание 2 урока 5) с использованием форматированного вывода.
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
        System.out.printf("Символу '%c' соответствует код: %s%n", symbol_1, symbol_1);
        System.out.printf("Символу '%c' соответствует код: %s%n", symbol_2, symbol_2);
        System.out.printf("Символу '%c' соответствует код: %s%n", symbol_3, symbol_3);
        System.out.printf("Символу '%c' соответствует код: %s%n", symbol_4, symbol_4);
        System.out.printf("Символу '%c' соответствует код: %s%n", symbol_5, symbol_5);

    }
}

//  Введите 5 любых символов на клавиатуре:
//  ^~(_=
//
//  Вот коды данных символов:
//  _____________________________
//  Символу '^' соответствует код: 94
//  Символу '~' соответствует код: 126
//  Символу '(' соответствует код: 40
//  Символу '_' соответствует код: 95
//  Символу '=' соответствует код: 61
