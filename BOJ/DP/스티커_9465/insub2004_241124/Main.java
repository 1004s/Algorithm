package BOJ.DP.스티커_9465.insub2004_241124;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /*
    처음 틀린 반례
     1
     10
     1 2 3 4 5 1 2 3 4 5
     1 3 5 7 9 1 3 5 7 9
     답 : 41
     출력 : 40
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] array = new int[2][N];

            StringTokenizer st0 = new StringTokenizer(br.readLine());
            StringTokenizer st1 = new StringTokenizer(br.readLine());

            int maxNum = -1;
            int maxHang = 0;
            int maxYeol = 0;
            for (int j = 0; j < N; j++) {
                int num0 = Integer.parseInt(st0.nextToken());
                int num1 = Integer.parseInt(st1.nextToken());
                if (maxNum < num0) {
                    maxNum = num0;
                    maxHang = 0;
                    maxYeol = j;
                } else if (maxNum < num1) {
                    maxNum = num1;
                    maxHang = 1;
                    maxYeol = j;
                }
                array[0][j] = num0;
                array[1][j] = num1;
            }

            // max값 기준 오른쪽 탐색
            int rightMax = rightMax(array, maxHang, maxYeol);

            // max값 기준 왼쪽 탐색
            int leftMax = leftMax(array, maxHang, maxYeol);

            System.out.println(maxNum + rightMax + leftMax);
        }
    }

    public static int rightMax(int[][] array,int maxHang, int maxYeol) {
        int value = 0;
        int standardHang;
        if (maxHang == 0) {
            standardHang = 1;
        } else {
            standardHang = 0;
        }

        for (int i = maxYeol + 1; i < array[0].length; i+=2) {
            if (i == array[0].length-1) {
                value += array[standardHang][i];
            } else {
                if (array[standardHang][i]+array[standardHang==1?0:1][i+1] > array[standardHang][i+1]) {
                    value += array[standardHang][i]+array[standardHang==1?0:1][i+1];
                } else {
                    value += array[standardHang][i+1];
                    standardHang = standardHang==1?0:1;
                }
            }
        }

        return value;
    }

    public static int leftMax(int[][] array,int maxHang, int maxYeol) {
        int value = 0;
        int standardHang;
        if (maxHang == 0) {
            standardHang = 1;
        } else {
            standardHang = 0;
        }

        for (int i = maxYeol-1; i >= 0; i-=2) {
            if (i == 0) {
                value += array[standardHang][i];
            } else {
                if (array[standardHang][i]+array[standardHang==1?0:1][i-1] > array[standardHang][i-1]) {
                    value += array[standardHang][i]+array[standardHang==1?0:1][i-1];
                } else {
                    value += array[standardHang][i-1];
                    standardHang = standardHang==1?0:1;
                }
            }
        }

        return value;
    }
}
