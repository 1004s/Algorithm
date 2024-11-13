package PGS.level_1.같은숫자는싫어;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insub2004_241111 {

    public static void main(String[] args) {

    }

    public int[] solution(int []arr) {

        List<Integer> list = new ArrayList<>();
        int value = arr[0];
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (value != arr[i]) {
                value = arr[i];
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

}
