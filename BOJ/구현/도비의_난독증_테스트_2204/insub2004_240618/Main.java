package BOJ.구현.도비의_난독증_테스트_2204.insub2004_240618;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

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

                for(int j = 0; j < min.length(); j++) {
                    if (min.charAt(j) > target.charAt(j)) {
                        min = target.toLowerCase();
                        result = i;
                        break;
                    }
                }
            }

            System.out.println(list.get(result));
        }
    }
}
