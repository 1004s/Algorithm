package BOJ.자료구조.민균이_비밀번호_9933.insub2004_240617;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        String[] arr = new String[count];
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < count; i++) {
            String str = br.readLine();
            arr[i] = str;

            int half = str.length()/2;
            map.put(str, String.valueOf(str.charAt(half)));
        }

        for (int i = 0; i < arr.length; i++) {
            StringBuffer sb = new StringBuffer(arr[i]);
            if(map.containsKey(sb.reverse().toString())) {
                System.out.print(sb.length() + " " + map.get(sb.reverse().toString()));
                break;
            }
        }

    }
}
