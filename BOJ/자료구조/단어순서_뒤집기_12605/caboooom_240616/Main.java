package BOJ.자료구조.단어순서_뒤집기_12605.caboooom_240616;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        for(int i=1; i<=N; i++) {
            System.out.print("Case #" + i + ": "); // 각 케이스별로 출력
            String[] words = reader.readLine().split(" "); // 입력받은 단어를 배열에 순서대로 저장
            int length = words.length;
            for(int j=length-1; j>=0; j--) { // 배열의 맨 뒤에서부터 단어를 하나씩 출력
                System.out.print(words[j] + " ");
            }
            System.out.println();
        }
    }
}
