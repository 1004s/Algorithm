package PGS.level_0.배열비교하기;

public class insub2004_240731 {

    public static int solution(int[] arr1, int[] arr2) {
        int answer = 0;

            // 두 배열의 길이가 다르면 배열의 길이가 긴 쪽이 더 크다.
        if (arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        } else {
            // 두 배열의 길이가 같으면 각 배열 안에 있는 모든 원소의 합을 비교, 더 큰 쪽이 크코 같으면 같다.
            for (int i : arr1) {
                answer += i;
            }
            for (int i : arr2) {
                answer -= i;
            }
            // arr1이 크면 1, arr2가 크면 -1, 같으면 0
        }
        return answer > 0 ? 1 : answer < 0 ? -1 : 0; //Integer.compare(answer, 0)
    }

    public static void main(String[] args) {

    }

}
