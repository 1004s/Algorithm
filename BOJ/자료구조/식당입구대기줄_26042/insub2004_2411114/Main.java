package BOJ.자료구조.식당입구대기줄_26042.insub2004_2411114;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        LinkedList<Integer> students = new LinkedList<>();

        int maxSize = -1;
        int minNumber = 100001;

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            if (str.length > 1) {
                students.add(Integer.parseInt(String.valueOf(str[1]))); // charAt(i)로 받으면 123을 1로만 저장...

                // 잘못 생각한 점
                // 1. 4명 대기중에 2명 빠지고 다시 6명이 줄섰으면 mas가 4 -> 6명이게 아니라 4 - 2 + 6이 되야함
                // 2. 이 계산을 2가 입력되었을 때가 아니라 1이 입력되었을 때 했어야 했다 -> 매번 사이즈를 봐야하니깐
                //
                if (students.size() > maxSize) {
                    maxSize = students.size();
                    minNumber = students.peekLast();    // 여러번일때는 최대대기줄일 때는 마지막 학생 숫자가 작은걸로 유지

                } else if (students.size() == maxSize) {
                    if (minNumber > students.peekLast()) {
                        minNumber = students.peekLast();    // 같을 때는 최대 대기줄일 때 마지막 학생 숫자가 작은걸로 유지
                    }
                }
            } else {
                students.poll();
            }
        }

        System.out.println(maxSize + " " + minNumber);
    }
}
