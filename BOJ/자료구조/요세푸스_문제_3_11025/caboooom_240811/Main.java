package BOJ.자료구조.요세푸스_문제_3_11025.caboooom_240811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);

        int result = 0;
        for(int i = 2; i <= n; i++) {
            result = (result + k) % i;
        }
        System.out.println(result + 1);
    }
}
