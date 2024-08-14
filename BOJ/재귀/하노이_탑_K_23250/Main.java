package BOJ.재귀.하노이_탑_K_23250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int k;
    public static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        k = Integer.parseInt(line[1]);
        hanoi(n, 1,2 ,3);
    }
    public static void hanoi(int n, int origin, int temp, int dest) {
        if (n == 1) {
            count++;
            if(count == k) {
                System.out.println(origin + " " + dest);
                System.exit(0);
            }
            return;
        }
        hanoi(n-1, origin, dest, temp);
        hanoi(1, origin, temp, dest);
        hanoi(n-1,temp, origin, dest);
    }
}