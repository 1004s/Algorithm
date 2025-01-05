package BOJ.정렬.숫자놀이_1755.insub2004_211127;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static String[] array = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static Map<String, Integer> maps = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = N; i <= M; i++) {
            String stringNumber = String.valueOf(i);

            if (stringNumber.length() == 1) {
                maps.put(array[i], i);
            } else {
                String firstNumber = String.valueOf(stringNumber.charAt(0));
                String secondNumber = String.valueOf(stringNumber.charAt(1));

                maps.put(array[Integer.parseInt(firstNumber)] + " " + array[Integer.parseInt(secondNumber)], i);
            }
        }

        List<String> sortedStringNumbers = new ArrayList<>(maps.keySet());
        Collections.sort(sortedStringNumbers);

        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for (String s : sortedStringNumbers) {
            sb.append(maps.get(s) + " ");
            cnt++;
            if (cnt == 10) {
                sb.append("\n");
                cnt = 0;
            }
        }
        System.out.println(sb);
    }

}
