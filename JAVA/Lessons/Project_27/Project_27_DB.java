package Project_27;

import java.util.HashMap;
import java.util.Map;

public class Project_27_DB {

  public static Map<Integer, String> phonesSet() {
// Множество Фамилия - Телефон
    Map<Integer, String> numberPhone = new HashMap<>();
    numberPhone.put(1, "+380935432435");
    numberPhone.put(2, "+380935475643");
    numberPhone.put(3, "+380935405648");
    numberPhone.put(4, "+380935463486");
    numberPhone.put(5, "+380935430671");
    numberPhone.put(6, "+380935447207");
    numberPhone.put(7, "+380935400184");
    numberPhone.put(8, "+380935440284");
    numberPhone.put(9, "+380345430671");
    return numberPhone;
  }
  public static Map<Integer, String> addressSet() {
    Map<Integer, String> numberAddress = new HashMap<>();
// Множество Номер - Адрес
    numberAddress.put(1, "Ленина");
    numberAddress.put(2, "Короленко");
    numberAddress.put(3, "Ленина");
    numberAddress.put(4, "Энгельса");
    numberAddress.put(5, "Правды");
    numberAddress.put(6, "Дружбы");
    numberAddress.put(7, "Дружбы");
    numberAddress.put(8, "Компьютерная");
    numberAddress.put(9, "Гугловская");
    return numberAddress;
  }

  public static Map<Integer, String> familyNameSet() {
    Map<Integer, String> numberName = new HashMap<>();

    // Множество Номер - Фамилия
    numberName.put(1, "Иванов");
    numberName.put(2, "Петров");
    numberName.put(3, "Сидоров");
    numberName.put(4, "Ноутбуков");
    numberName.put(5, "Сидоров");
    numberName.put(6, "Коробкин");
    numberName.put(7, "Смартфонов");
    numberName.put(8, "Иванов");
    numberName.put(9, "Сидоров");
    return numberName;
  }
}
