package BOJ.구현.도비의_난독증_테스트_2204.insub2004_240618;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int count = Integer.parseInt(br.readLine());

            if (count == 0) break;

            ArrayList<String> list = new ArrayList<>();

            for (int i = 0; i < count; i++) {
                list.add(br.readLine());
            }

            String min = list.get(0).toLowerCase();
            int result = 0;

            for (int i = 1; i < list.size(); i++) {
                String target = list.get(i).toLowerCase();

                for (int j = 0; j < min.length(); j++) {
                    if (min.charAt(j) > target.charAt(j)) {
                        min = target.toLowerCase();
                        result = i;
                        break;
                    } else if (min.charAt(j) == target.charAt(j)) {
                        if (j == target.length()-1) {
                            min = target.toLowerCase();
                            result = i;
                            break;
                        }
                        continue;
                    }
                    break;
                }
            }

            System.out.println(list.get(result));
        }
    }
}
