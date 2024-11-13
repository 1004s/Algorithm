package BOJ.DP.쉬운계단수_10844.insub2004_241112;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    // 문제풀이 1시간, 못 풀어서 다른 풀이
    /*
    제일 뒷자리 숫자  N=1   2   3  .... j
   i    0           0   1   1
        1           1   1   3
        2           1   2   3
        3           1   2   4
        4           1   2   4
        5           1   2   4
        6           1   2   4
        7           1   2   4
        8           1   2   3
        9           1   1   2
     */
    static final int MOD = 1_000_000_000;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[][] arr = new long[10][N];
        for (int i = 1; i < 10; i++) {
            arr[i][0] = 1;  // 0,0을 제외하고 1로 채워야함
        }

        for (int i = 1; i < N; i++) {       // i는 열
            arr[0][i] = arr[1][i-1] % MOD;
            arr[9][i] = arr[8][i-1] % MOD;

            for (int j = 1; j <=8; j++) {   // j는 행
                arr[j][i] = arr[j-1][i-1] % MOD + arr[j+1][i-1] % MOD;
            }
        }

        int answer = 0;
        for (int i = 0; i < 10; i++) {
            answer += arr[i][N-1] % MOD;
        }

        System.out.println(answer);
    }
}
