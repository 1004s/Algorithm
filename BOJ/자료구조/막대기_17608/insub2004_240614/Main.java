package BOJ.자료구조.막대기_17608.insub2004_240614;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        int[] arr = new int[length];

        Deque<Integer> queue = new LinkedList<>();

        for(int i = length-1; i >= 0; i--) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < length; i++) {
            queue.add(arr[i]);
        }

        int max = queue.poll();
        int result = 0;
        for(int i = 0; i < length-1; i++) {
            int num = queue.poll();
            if (num > max) {
                result++;
                max = num;
            }
        }

        System.out.println(result+1);
    }
}
