package BOJ.구현.성_지키기_1236.insub2004_240619;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String length = br.readLine();
        String[] len = length.split(" ");

        int x = Integer.parseInt(len[0]);
        int y = Integer.parseInt(len[1]);

        String[][] arr = new String[x][y];

        for (int i = 0; i < x; i++) {
            String str = br.readLine();
            for (int j = 0; j < y; j++) {
                arr[i][j] = String.valueOf(str.charAt(j));
            }
        }

        int xGuard = x;
        int yGuard = y;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (arr[i][j].equals("X")) {
                    xGuard--;
                    break;
                }
            }
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (arr[j][i].equals("X")) {
                    yGuard--;
                    break;
                }
            }
        }

        System.out.println(Math.max(xGuard, yGuard));


    }
}
