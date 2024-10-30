package BOJ.구현.도비의_난독증_테스트_2204.caboooom_240618;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(null);
        list.add(1);

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.ensureCapacity(1000);
        list.add(6);

        Integer[] list2 = new Integer[1];
        list2[0] = null;
    }
}
