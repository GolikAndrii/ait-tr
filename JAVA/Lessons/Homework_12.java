import java.io.*;

public class Homework_12 {
    final public static String YELLOW = "желтый";
    final public static String RED = "красный";
    final public static String BLUE = "синий";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String red = "красный";

        System.out.println("Выберите 2 любых цвета из следующих: красный, синий или желтый: ");
        System.out.println("Введите 2 любых цвета через пробел: ");
        System.out.println("Например, 'красный синий'");
        String source = br.readLine();
        int space = source.indexOf(' ');

        String firstColor = source.substring(0, space);
        String secondColor = source.substring(space+1);

        if  ((firstColor.equalsIgnoreCase("красный") && (secondColor.equalsIgnoreCase("синий")))
            ||
            (firstColor.equalsIgnoreCase("синий") && (secondColor.equalsIgnoreCase("красный"))))
        {
            System.out.println("При смешении этих цветов получится ФИОЛЕТОВЫЙ цвет");
        }

        else if ((firstColor.equalsIgnoreCase("красный") && (secondColor.equalsIgnoreCase("желтый")))
                ||
                (firstColor.equalsIgnoreCase("желтый") && (secondColor.equalsIgnoreCase("красный"))))
        {
            System.out.println("При смешении этих цветов получится ОРАНЖЕВЫЙ цвет");
        }

        else if  ((firstColor.equalsIgnoreCase("синий") && (secondColor.equalsIgnoreCase("желтый")))
                ||
                (firstColor.equalsIgnoreCase("желтый") && (secondColor.equalsIgnoreCase("синий"))))
        {
            System.out.println("При смешении этих цветов получится ЗЕЛЕНЫЙ цвет");
        }

        else if (firstColor.equals("красный") || firstColor.equals("синий") || firstColor.equals("желтый"))
        {
            System.out.printf("При смешении этих цветов получится %s цвет", firstColor.toUpperCase());

        } 
        
        else {
            System.out.println("Вы ввели некорректное значение. Начните сначала ;-)");
        }
    }
}
