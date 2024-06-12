package BOJ.구현.단어의_개수_1152.insub2004_240612;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().trim().split("\\s");

        int result = str.length;

        if(str.length == 1 && !str[0].contains("\\w")) {
            if(str[0].contains())
            result = 0;
        }

        System.out.println(result);
    }
}
