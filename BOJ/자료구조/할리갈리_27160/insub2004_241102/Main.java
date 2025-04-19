package BOJ.자료구조.할리갈리_27160.insub2004_241102;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            String[] str = br.readLine().split(" ");

            if (!map.containsKey(str[0])) {
                map.put(str[0], Integer.parseInt(str[1]));
            } else {
                int total = map.get(str[0]);
                map.put(str[0], total + Integer.parseInt(str[1]));
            }
        }

        if (map.containsValue(5)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
