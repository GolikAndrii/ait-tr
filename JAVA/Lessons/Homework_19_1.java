import java.io.*;

public class Homework_19_1 {
    public static void main(String[] args) throws IOException {
    checkInterval(70);

    }
    public static void checkInterval(int number){
        if(number >=50 && number<=100){
            System.out.printf("Число %d содержится в интервале.", number);
        } else {
            System.out.printf("Число %d не содержится в интервале.", number);
        }
    }
}
