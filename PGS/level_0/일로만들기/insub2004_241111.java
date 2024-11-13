package PGS.level_0.일로만들기;

public class insub2004_241111 {

    public static void main(String[] args) {
        class Solution {
            public int solution(int[] num_list) {
                int answer = 0;
                for (int i = 0; i < num_list.length; i++)
                    while (num_list[i] > 1) {
                        num_list[i] = num_list[i] / 2;
                        answer++;
                    }
                return answer;
            }
        }
    }

}
