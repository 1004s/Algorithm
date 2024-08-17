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

        int[] eliminated = new int[n];
        int peopleLeft = n;
        int count = 0;
        int index = -1;

        while(peopleLeft > 1) {
            while(count < k) {
                ++index;
                if(eliminated[index % n] == 0) {
                    count++;
                }
            }
            eliminated[index % n] = 1;
            peopleLeft--;
            count = 0;
        }

        for(int i = 0; i < n; i++) {
            if(eliminated[i] == 0) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
