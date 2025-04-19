package PGS.level_0.뒤에서5등위로;

public class insub2004_241030 {
    public int[] solution(int[] num_list) {

        for (int i = 0; i < num_list.length; i++) {
            int min = num_list[i];
            int idx = 0;
            for(int j = i; j < num_list.length; j++) {
                if (min > num_list[j]) {
                    min = num_list[j];
                    idx = j;
                }
            }

            int tmp = num_list[i];
            num_list[i] = min;
            num_list[idx] = tmp;
        }

        int[] sortedArray = new int[num_list.length - 5];

        for (int i = 5; i < num_list.length; i++) {
            sortedArray[i-5] = num_list[i];
        }


        return sortedArray;
    }
}
