package BOJ.자료구조.민균이비밀번호_9933.insub2004_241106;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static Map<String,String> stringMap = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] ss = {"asd","as","zzz"};

        String answer = "";

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (isPalindrome(str)) {
                answer = getMiddleWord(str);

                break;
            } else {
                String reversed = new StringBuilder(str).reverse().toString();
                if (stringMap.containsKey(reversed)) {
                    answer = getMiddleWord(str);
                    break;
                }
                stringMap.put(str, "");
            }
        }

        System.out.println(answer);
    }

    public static boolean isPalindrome (String str) {
        boolean answer = true;

        for (int i = 0, j = str.length() -1; i < str.length()/2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                answer = false;
                break;
            }
        }

        return answer;
    }

    public static String getMiddleWord(String str) {
        return  str.length()+ " " +str.charAt(str.length()/2);

    }
}
