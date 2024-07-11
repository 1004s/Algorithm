package Elice.Day02.caboooom_240711;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = reader.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        String[] arrStr = reader.readLine().split(" ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        int i;
        int j;
        int k;
        for(int iter = 0; iter < m; iter++) {
            String[] input = reader.readLine().split(" ");
            i = Integer.parseInt(input[0]);
            j = Integer.parseInt(input[1]);
            k = Integer.parseInt(input[2]);

            List<Integer> list = new ArrayList<>();
            for(int idx = i - 1; idx < j; idx++) {
                list.add(arr[idx]);
            }
            Object[] array = list.toArray();
            Arrays.sort(array);
            System.out.println(array[k-1]);
        }
    }
}
