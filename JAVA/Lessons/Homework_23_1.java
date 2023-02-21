//  Напишите программу, которая:
//  - прочитает размер списка
//  - будет добавлять элементы в список, но каждый раз в начало, а не в конец списка, как обычно
//  - выведет получившийся список

import java.util.ArrayList;
import java.util.List;

public class Homework_23_1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>(list1);
        list2.add(0,4);
        for (int x : list2) {
            System.out.println(x);
        }
    }
}
