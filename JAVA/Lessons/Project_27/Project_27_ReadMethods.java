package Project_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project_27_ReadMethods {
  public static String readFamilyName() throws IOException {  //readFamilyName
    BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
    System.out.print("Введите фамилию или ее часть:");
    String name = br.readLine();
    return name;
  }

  public static String readAddress() throws IOException { //readPhone
    System.out.print("Введите адрес или его часть: ");
    BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
    String address = br.readLine();
    return address;
  }
}
