package PGS.level_0.문자열정수의합;

public class insub2004_241030 {
    public static int solution(String num_str) {
        int answer = 0;

        for (int i = 0; i < num_str.length(); i++) {
            int val = Integer.parseInt(num_str.substring(i, i+1));
            answer += val;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("123456789"));
    }
}
