// Все задачи в одной

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Homework_24_1 {
    public static void main(String[] args) throws IOException {
        List<String> records = new ArrayList<>(); // дела -- записи
        while (true) {
            int command = readCommand();
            switch (command) {
                case 1 -> addRecord(records);
                case 2 -> printRecords(records);
                case 3 -> removeRecord(records);
                case 4 -> {
                    System.out.println("До свидания!");
                    return; // выйти из метода main, то есть закрыть программу вообще
                }
            }
        }
    }

    public static void addRecord(List<String> records) throws IOException {
        System.out.println("Добавляем запись:");
        System.out.println("----------------------");
        System.out.print("Введите задание: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String item = br.readLine();
        records.add(item);
        printRecords(records);
    }

    public static void printRecords(List<String> records) {
        System.out.println("Мой список дел");
        System.out.println("----------------------");
        int number = 0;
        for (String item : records) {
            System.out.println(++number + " " + item);
        }
        System.out.println("----------------------");
    }


    public static void removeRecord(List<String> records) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Удаление задания");
        System.out.println("----------------------");
        System.out.print("Введите номер задания, которое нужно удалить");
        int index = Integer.parseInt(br.readLine());
        if((index-1)<0 || index>records.size()) {
            System.out.println("Неправильный номер! Введите номер от 1 до "+records.size());
        }else {
            records.remove(index-1);
        }
        System.out.println("----------------------");
        printRecords(records);
    }

    public static void menu() {
        System.out.println("Меню:");
        System.out.println("1. Добавить запись");
        System.out.println("2. Посмотреть весь список");
        System.out.println("3. Удалить запись");
        System.out.println("4. Выйти");
    }

    public static int readCommand() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        menu();
        int command = 0; // воображаемая неправильная команда
        while (!(1 <= command && command <= 4)) { // пока команда неправильная
            System.out.print("Выберите команду: ");
            try {
                command = Integer.parseInt(br.readLine()); // читаем команду с клавиатуры
            } catch (NumberFormatException e) {
                System.out.println("Неправильный формат ввода: " + e.getMessage());
            }
            if (!(1 <= command && command <= 4)) {
                System.out.println("Введите номер команды от 1 до 4");
            }
        }
        return command;
    }
}
