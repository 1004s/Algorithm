package BOJ.구현.단어의_개수_1152.caboooom_240612;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().trim();
        if(input.isEmpty()) {
            System.out.println(0);
            System.exit(0);
        }
        String[] words = input.split(" ");
        System.out.println(words.length);
    }
}
