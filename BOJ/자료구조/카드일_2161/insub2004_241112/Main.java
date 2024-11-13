package BOJ.자료구조.카드일_2161.insub2004_241112;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(null);

        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
//        for (int i = 1; i <= N; i++) {
//            queue.add(i);
//        }
//
//        while (!Objects.isNull(queue.peek())) {
//            System.out.println(queue.poll());
//            queue.add(queue.poll());
//        }
    }
}
