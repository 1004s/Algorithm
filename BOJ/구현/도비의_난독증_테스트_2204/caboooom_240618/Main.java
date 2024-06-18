package BOJ.구현.도비의_난독증_테스트_2204.caboooom_240618;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n;
        while ((n = Integer.parseInt(reader.readLine())) != 0) {

            String firstWord = reader.readLine();

            for (int i = 1; i < n; i++) {
                String word = reader.readLine();
                if(word.compareToIgnoreCase(firstWord) < 0) {
                    firstWord = word;
                }
            }

            System.out.println(firstWord);
        }
    }
}
