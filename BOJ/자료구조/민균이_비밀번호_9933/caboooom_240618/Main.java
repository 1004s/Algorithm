package BOJ.자료구조.민균이_비밀번호_9933.caboooom_240618;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        List<String> words = new ArrayList<>();
        for(int i=0; i<N; i++) {
            String word = reader.readLine();
            int length = word.length();

            String reversedWord = reverseString(word);
            if(words.contains(word) || word.equals(reversedWord)) {
                System.out.println(length + " " + word.toCharArray()[length/2]);
            }
            words.add(reversedWord);
        }
    }

    public static String reverseString(String str) {
        char[] arr = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=arr.length; i>0; i--) {
            stringBuilder.append(arr[i-1]);
        }
        return stringBuilder.toString();
    }
}
