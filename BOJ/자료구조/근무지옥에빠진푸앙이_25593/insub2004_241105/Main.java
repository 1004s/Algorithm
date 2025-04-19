package BOJ.자료구조.근무지옥에빠진푸앙이_25593.insub2004_241105;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    // 4, 6, 4, 10 시간씩
    // 최대 50주치 근무표, 각 인원의 근무 시간이 12시간 이하

    // 첫째 줄 주의 개수인 N
    // 둘째 줄부터 근무표. 각 주는 4개의 줄로 표현

    private static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 4; j++) {
                String[] str = br.readLine().split(" ");

                for (int k = 0; k < str.length; k++) {
                    if (!str[k].equals("-")) {
                        if (map.containsKey(str[k])) {
                            if (j == 0 || j == 2) {     // 4시간
                                map.put(str[k], map.get(str[k]) + 4);
                            } else if (j == 1) {        // 6시간
                                map.put(str[k], map.get(str[k]) + 6);
                            } else {                    // 10시간
                                map.put(str[k], map.get(str[k]) + 10);
                            }
                        } else {
                            if (j == 0 || j == 2) {     // 4시간
                                map.put(str[k], 4);
                            } else if (j == 1) {        // 6시간
                                map.put(str[k], 6);
                            } else {                    // 10시간
                                map.put(str[k], 10);
                            }
                        }
                    }
                }
            }
        }

        Object[] integers = map.values().toArray();
        boolean answer = true;
        for (int i = 0; i < integers.length; i++) {
            int time = (int) integers[i];
            for (int j = i+1; j <  integers.length; j++) {
                int rest = (int) integers[j];

                if (time - rest > 12 || time - rest < -12) {
                    answer = false;
                    break;
                }
            }
        }

        if (answer) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
