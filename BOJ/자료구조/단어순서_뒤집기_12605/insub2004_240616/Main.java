package BOJ.자료구조.단어순서_뒤집기_12605.insub2004_240616;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());

        String[] str = new String[length];
        for (int i = 0; i < length; i++) {
            str[i] = br.readLine();
        }

        for (int i = 0; i < length; i++) {
            String[] result = str[i].split(" ");
            System.out.printf("Case #%d: ",i+1);
            for (int j = result.length-1 ; j >= 0; j--) {
                System.out.printf(result[j] + " ");
            }
            System.out.println();
        }
    }
}
