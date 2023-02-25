package Homework_29;

import java.io.*;
import java.util.*;

public class Homework_29_1 {
    public static void main(String[] args) throws IOException {
        HashMap<Character, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int count;

        for (int i = 0; i < str.length(); i++) {
            if (map.isEmpty() || !map.containsKey(str.charAt(i))) {
                map.put( str.charAt(i), 1 );
            } else {
                count = map.get(str.charAt(i));
                map.replace( str.charAt(i), ++count);
            }
        }
        for (Map.Entry<Character, Integer> pair: map.entrySet()) {
            System.out.println(pair.getKey() + ":" + " " + pair.getValue());
        }
    }
}
