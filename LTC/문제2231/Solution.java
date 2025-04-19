package LTC.문제2231;

import java.util.Collections;
import java.util.PriorityQueue;

class Solution {

    public static void main(String[] args) {
        System.out.println(largestInteger(247));
    }

    public static int largestInteger(int num) {
        PriorityQueue<Integer> oddQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> evenQueue = new PriorityQueue<>(Collections.reverseOrder());
        String s = num + "";

        while (num > 0) {
            int n = num % 10;
            num = num / 10;

            if (n % 2 == 0) {
                evenQueue.add(n);
            } else {
                oddQueue.add(n);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.getNumericValue(s.charAt(i)) % 2 == 0) {
                sb.append(evenQueue.poll());
            } else {
                sb.append(oddQueue.poll());
            }
        }

        return Integer.parseInt(sb.toString());
    }
}