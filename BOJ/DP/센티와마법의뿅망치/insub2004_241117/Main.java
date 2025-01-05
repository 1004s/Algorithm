package BOJ.DP.센티와마법의뿅망치.insub2004_241117;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int centiHeight = Integer.parseInt(stringTokenizer.nextToken());
        int hammerMinCount = Integer.parseInt(stringTokenizer.nextToken());

        PriorityQueue<Integer> giantDescendingQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            giantDescendingQueue.add(Integer.parseInt(br.readLine()));
        }

        int answer = 0;
        for (int i = 0; i < hammerMinCount; i++) {
            if (giantDescendingQueue.peek() < centiHeight || giantDescendingQueue.peek() == 1) {
                break;
            }
            int tallGiant = giantDescendingQueue.poll();
            giantDescendingQueue.add(tallGiant/2);
            answer++;
        }

        if (giantDescendingQueue.peek() >= centiHeight) {
            System.out.println("NO");
            System.out.println(giantDescendingQueue.poll());
        } else {
            System.out.println("YES");
            System.out.println(answer);
        }
    }
}
