import java.io.*;

public class Homework_10 {
    final public static char POW = '\u00B2';

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Программа вычисления площади фигуры.");
        System.out.println("Введите название фигуры (квадрат, прямоугольник или круг) ");
        String figure = br.readLine();

        if (figure.equalsIgnoreCase("Квадрат")) {
            System.out.println("Введите длину стороны квадрата, см: ");
            int sideOfSquare = Integer.parseInt(br.readLine());
            int square = (int) Math.pow(sideOfSquare, 2);
            System.out.printf("Площадь квадрата с длиной стороны %dсм равна: %dсм%c%n", sideOfSquare, square, POW);

        } else if (figure.equalsIgnoreCase("Прямоугольник")) {
            System.out.print("Введите длину одной стороны прямоугольника, см.: ");
            int sideOfSquareA = Integer.parseInt(br.readLine());
            System.out.print("Введите длину другой стороны прямоугольника, см.: ");
            int sideOfSquareB = Integer.parseInt(br.readLine());
            int square = sideOfSquareA * sideOfSquareB;
            System.out.printf("Площадь прямоугольника с длиной сторон %dсм и %dсм равна: %dсм%c%n", sideOfSquareA, sideOfSquareB, square, POW);

        } else if (figure.equalsIgnoreCase("Круг")) {
            System.out.print("Введите длину радиуса круга: ");
            int radius = Integer.parseInt(br.readLine());
            int square = (int) (Math.PI * Math.pow(radius, 2));
            System.out.printf("Площадь круга с радиусом %dсм равна: %dсм%c%n", radius, square, POW);
        } else {
            System.out.print("Такой фигуры не существует :-)");
        }
    }
}
