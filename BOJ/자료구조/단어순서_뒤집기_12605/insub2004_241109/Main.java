package BOJ.자료구조.단어순서_뒤집기_12605.insub2004_241109;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalCase = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < totalCase; i++) {
            String[] str = br.readLine().split(" ");

            Stack<String> strings = new Stack<>();
            for (String s : str) {
                strings.push(s);
            }

            StringBuilder sb = new StringBuilder();
            while (!strings.isEmpty()) {
                sb.append(" ").append(strings.pop());
            }

            answer.append("Case #").append(i+1).append(":").append(sb).append("\n");
        }

        System.out.println(answer);
    }
}
