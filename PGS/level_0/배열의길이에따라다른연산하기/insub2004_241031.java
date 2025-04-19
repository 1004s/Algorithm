package PGS.level_0.배열의길이에따라다른연산하기;

public class insub2004_241031 {
    class Solution {
        public int[] solution(int[] arr, int n) {
            int[] answer = {};

            if (arr.length % 2 == 0) {
                for (int i = 1; i < arr.length; i+=2) {
                    arr[i] += n;
                }
            } else {
                for (int i = 0; i < arr.length; i+=2) {
                    arr[i] += n;
                }
            }

            return arr;
        }
    }
}
