package BOJ.자료구조.N번쨰큰수_2075.insub2004_241116;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreElements()) {
                queue.add(Integer.parseInt(st.nextToken()));
            }
        }

        int answer = 0;
        while (num != 0) {
            answer = queue.poll();
            num--;
        }

        System.out.println(answer);
    }
}
