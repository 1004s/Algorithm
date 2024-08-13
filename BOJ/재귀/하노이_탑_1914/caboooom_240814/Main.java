package BOJ.재귀.하노이_탑_1914.caboooom_240814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int k = (int) Math.pow(2, n) - 1;
        System.out.println(k);
        hanoiTower(n, 1, 2, 3);
    }

    public static void hanoiTower(int n, int origin, int temp, int dest) {
        if(n == 1) {
            System.out.println(origin + " " + dest);
            return;
        }
        hanoiTower(n-1, origin, dest, temp);
        if(n <= 20) {
            System.out.println(origin + " " + dest);
        }
        hanoiTower(n-1, temp, origin, dest);
    }
}
