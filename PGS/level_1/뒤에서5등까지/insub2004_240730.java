package PGS.level_1.뒤에서5등까지;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class insub2004_240730 {

    public static int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();

        for (int i : num_list) {
            list.add(i);
        }

        Collections.sort(list);

        int[] answer = new int[5];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = solution(new int[]{12, 4, 15, 46, 38, 1, 14});
        System.out.println(Arrays.toString(arr));
    }
}
