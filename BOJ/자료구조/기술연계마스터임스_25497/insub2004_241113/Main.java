package BOJ.자료구조.기술연계마스터임스_25497.insub2004_241113;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        Stack<Character> sStack = new Stack<>();
        Stack<Character> lStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= '1' && c <= '9') {
                answer++;
            } else if (c == 'S') {
                sStack.push(c);
            } else if (c == 'L') {
                lStack.push(c);
            } else if (c == 'K') {
                if (!sStack.empty()) {
                    sStack.pop();
                    answer++;
                } else {
                    break;
                }
            } else if (c == 'R') {
                if (!lStack.empty()) {
                    lStack.pop();
                    answer++;
                } else {
                    break;
                }
            }
        }

        System.out.println(answer);
        br.close();
    }
}
