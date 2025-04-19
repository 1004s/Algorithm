package BOJ.자료구조.모스부호_29701.insub2004_241101;

import java.io.*;
import java.util.*;

public class Main {

    public static HashMap<String,String> makeMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put(".-", "A");
        map.put("-...", "B");
        map.put("-.-.", "C");
        map.put("-..", "D");
        map.put(".", "E");
        map.put("..-.", "F");
        map.put("--.", "G");
        map.put("....", "H");
        map.put("..", "I");
        map.put(".---", "J");
        map.put("-.-", "K");
        map.put(".-..", "L");
        map.put("--", "M");
        map.put("-.", "N");
        map.put("---", "O");
        map.put(".--.", "P");
        map.put("--.-", "Q");
        map.put(".-.", "R");
        map.put("...", "S");
        map.put("-", "T");
        map.put("..-", "U");
        map.put("...-", "V");
        map.put(".--", "W");
        map.put("-..-", "X");
        map.put("-.--", "Y");
        map.put("--..", "Z");
        map.put(".----", "1");
        map.put("..---", "2");
        map.put("...--", "3");
        map.put("....-", "4");
        map.put(".....", "5");
        map.put("-....", "6");
        map.put("--...", "7");
        map.put("---..", "8");
        map.put("----.", "9");
        map.put("-----", "0");
        map.put("--..--", ",");
        map.put(".-.-.-", ".");
        map.put("..--..", "?");
        map.put("---...", ":");
        map.put("-....-", "-");
        map.put(".--.-.", "@");
        return map;
    }

    public static void main(String[] args) throws Exception {

        Map<String,String> map = makeMap();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        String[] mosArray = br.readLine().split(" ");

        for (int i = 0 ; i < mosArray.length; i++) {
            if (map.containsKey(mosArray[i])) {
                sb.append(map.get(mosArray[i]));
            }
        }

        System.out.println(sb);
    }

}
