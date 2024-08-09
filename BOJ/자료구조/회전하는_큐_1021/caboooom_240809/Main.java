package BOJ.자료구조.회전하는_큐_1021.caboooom_240809;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        line = reader.readLine().split(" ");
        int shiftCount = 0;
        int headIndex = 0;
        for(int i = 0; i < m; i++) {
            int targetIndex = Integer.parseInt(line[i]) - 1 - i;
            int idx;
            if(targetIndex < headIndex) {
                idx = n - ((headIndex-1) - targetIndex);
            } else {
                idx = headIndex + targetIndex;
            }
            if(idx < n/2) {
                shiftCount += (idx+1);
                n--;
//                headIndex += shiftCount;
//                if(headIndex >= n) {
//                    headIndex = (headIndex-n-1);
//                } TODO
            } else {
                shiftCount += (n-idx);
                n--;

                // shift 한만큼 headIdx를 증가
                headIndex -= (n-1-idx);
                if(headIndex < 0) {
                    headIndex = (n-1-headIndex);
                }
            }
//            m--;
        }
        System.out.println(shiftCount);
    }

}

