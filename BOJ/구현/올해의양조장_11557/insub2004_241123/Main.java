package BOJ.구현.올해의양조장_11557.insub2004_241123;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {

            int N = Integer.parseInt(br.readLine());
            String[] strings = new String[N];
            int[] ints = new int[N];

            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                strings[j] = st.nextToken();
                ints[j] = Integer.parseInt(st.nextToken());
            }

            int idx = -1;
            int max = -1;
            for (int k = 0; k < N; k++) {
                if (max < ints[k]) {
                    max = ints[k];
                    idx = k;
                }
            }

            System.out.println(strings[idx]);
        }

    }

}
