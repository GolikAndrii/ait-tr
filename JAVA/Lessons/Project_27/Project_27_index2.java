/*
package Project_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import static Project_27.Project_27_Const.*;
import static Project_27.Project_27_DB.*;
import static Project_27.Project_27_FindMethods.*;
import static Project_27.Project_27_Menu.readCommand;
import static Project_27.Project_27_ReadMethods.*;

public class Project_27_index2 {
  public static void main(String[] args) throws IOException {
    Map<Integer, String> numberName = familyNameSet();
    Map<Integer, String> numberAddress = addressSet();
    Map<Integer, String> numberPhone = phonesSet();

    while (true) {
      int command = readCommand();
      switch (command) {
        case 1 -> {
          String[] arr = findNamePart(readFamilyName(),numberName,numberPhone,numberAddress ); // findName

          System.out.println(ANSI_BLUE + "======== Результат =======");
          System.out.printf(ANSI_BLUE + "Фамилия: %s, адрес: %s, телефон: %s%n", arr[0], arr[1], arr[2]);
          System.out.printf(ANSI_BLUE + "--------------------------");
          System.out.println();
        }
        case 2 -> {
          String[] arr = findAddressPart(readAddress(), numberName,numberPhone,numberAddress); // findAddress
          System.out.printf("Фамилия: %s, адрес: %s, телефон: %s%n", arr[0], arr[1], arr[2]);
        }
        case 3 -> printAll(numberName,numberPhone,numberAddress);
        case 4 -> addNew(numberName, numberPhone, numberAddress);
        case 5 -> {
          System.out.println("До свидания!");
          return;
        }
      }
    }
  }
  public static void printAll(Map<Integer, String> newItemName, Map<Integer,
      String> newItemPhone, Map<Integer, String> newItemAddress) {
    System.out.println(ANSI_YELLOW+ "===== Телефонная книга =====");
    for (Integer indexInSet : newItemName.keySet()) {
      String name = newItemName.get(indexInSet);
      String phone = newItemPhone.get(indexInSet);
      String address = newItemAddress.get(indexInSet);
      System.out.printf(ANSI_CYAN+ "Фамилия: %16s| адрес: %15s| телефон: %12s%n", name, address, phone);
    }
  }
  public static void addNew(Map<Integer, String> newItemName, Map<Integer,
      String> newItemPhone, Map<Integer, String> newItemAddress) throws IOException {
    {
      System.out.print("Введите новую фамилию: ");
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      newItemName.put(newItemName.size() + 1, br.readLine());

      System.out.print("Введите номер телефона: ");
      newItemPhone.put(newItemPhone.size() + 1, br.readLine());

      System.out.print("Введите адрес: ");
      newItemAddress.put(newItemAddress.size() + 1, br.readLine());

    }
  }
  public static String[] getRecord(int index, Map<Integer, String> newItemName, Map<Integer,
      String> newItemPhone, Map<Integer, String> newItemAddress) {
    String[] arr = new String[3];
    arr[0] = newItemName.get(index);
    arr[1] = newItemAddress.get(index);
    arr[2] = newItemPhone.get(index);
    return arr;
  }

}
*/
