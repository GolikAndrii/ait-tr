package Homework_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_29_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String firstRowWords = br.readLine();
        String secondRowWords = br.readLine();

        char[] chArr1 = firstRowWords.toUpperCase().toCharArray();
        char[] chArr2 = secondRowWords.toUpperCase().toCharArray();

        for (int i = chArr1.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (chArr1[j] > chArr1[j + 1])
                {
                    char tmp = chArr1[j];
                    chArr1[j] = chArr1[j + 1];
                    chArr1[j + 1] = tmp;
                }
            }
        }
        for (int i = chArr2.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (chArr2[j] > chArr2[j + 1])
                {
                    char tmp = chArr2[j];
                    chArr2[j] = chArr2[j + 1];
                    chArr2[j + 1] = tmp;
                }
            }
        }

        String firstValueOfChar = String.valueOf(chArr1);
        String SecondValueOfChar = String.valueOf(chArr2);
        firstValueOfChar = firstValueOfChar.replaceAll(" ", "");
        SecondValueOfChar = SecondValueOfChar.replaceAll(" ", "");

        if(firstValueOfChar.equalsIgnoreCase(SecondValueOfChar)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
