package BOJ.자료구조.줄_세우기_2605.insub2004_240615;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());

        String[] count = br.readLine().split(" ");

        LinkedList<Integer> list = new LinkedList<>();

        int num = 1;
        for (int i = 0; i < length; i++) {
            list.add(Integer.parseInt(count[i]), num++);
        }

        for (int i = length-1; i >= 0; i--) {
            System.out.printf(list.get(i) + " ");
        }
    }
}
