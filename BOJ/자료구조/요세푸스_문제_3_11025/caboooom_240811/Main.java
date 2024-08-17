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

        if(n == 1) {
            System.out.println(1);
            System.exit(0);
        }
        if(n == 2) {
            if(k == 1) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
            System.exit(0);
        }
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = k;

        for(int i = 2; i <= n; i++) {
            dp[i] = (dp[i-1] + k) % n;
        }

        System.out.println(dp[n-1]);

    }
}
