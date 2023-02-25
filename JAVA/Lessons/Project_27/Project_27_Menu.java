package Project_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static Project_27.Project_27_Const.*;

public class Project_27_Menu {

  public static void menu() {
    System.out.println(ANSI_YELLOW + "========== Меню =========");
    System.out.println(ANSI_YELLOW + "_________________________");
    System.out.println(ANSI_PURPLE+ "1. Поиск по фамилии");
    System.out.println("2. Поиск по адресу");
    System.out.println("3. Отобразить всю книгу");
    System.out.println("4. Добавить новую запись");
    System.out.println("5. Выйти");
    System.out.println(ANSI_YELLOW + "_________________________");
  }
  public static int readCommand() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    menu();
    int command = 0;
    int commandValue = 5;
    while (!(1 <= command && command <= commandValue)) {
      System.out.print(ANSI_CYAN+ "Выберите команду: ");
      try {
        command = Integer.parseInt(br.readLine());
      } catch (NumberFormatException e) {
        System.out.println(ANSI_WHITE + "Неправильный формат ввода: " + e.getMessage());
      }
      if (!(1 <= command && command <= commandValue)) {
        System.out.println(ANSI_WHITE + "Введите номер команды от 1 до " + commandValue);
      }
    }
    return command;
  }
}
