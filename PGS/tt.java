package PGS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class tt {
    public static int solution(String[][] clothes) {
        int answer = 0;
        // [2차원 배열 길이] + ["종류"를 Set에 넣고 총 갯수를 n*n-1*n-2...1까지 더하기]

        int len = clothes.length;
        System.out.println(len);
        Set<String> types = new HashSet<>();

        for (int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1];
            types.add(type);
        }

        System.out.println(types);

        int num = 1;

        for (int i = types.size(); i > 0; i--) {
            num *= i;
        }

        if (types.size() == 1) {
            return len;
        } else {
            return num + len;
        }
    }

    public static void main(String[] args) {
        String[][] clothes = new String[][] {
                {"crow_mask", "face"},
                {"blue_sunglasses", "face"},
                {"smoky_makeup", "face"}
        };

        System.out.println(solution(clothes));
    }
}
