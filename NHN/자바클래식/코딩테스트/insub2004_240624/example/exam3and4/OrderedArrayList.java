package NHN.자바클래식.코딩테스트.insub2004_240624.example.exam3and4;

import example.exception.AlreadyEmptyException;
import example.exception.AlreadyFullException;

import java.util.Arrays;

public class OrderedArrayList implements List {

    int [] values;
    int [] nexts;

    private final int capacity;
    private int size;
    private int headIndex;

    public OrderedArrayList(int capacity) {
        this.capacity = capacity;
        values = new int[capacity];
        nexts = new int[capacity];
        Arrays.fill(values, Integer.MIN_VALUE);
        Arrays.fill(nexts,  Integer.MIN_VALUE);
        headIndex = -1;
        size = 0;
    }

    @Override
    public void insert(int value) {

        if (size + 1 > capacity) {
            throw new AlreadyFullException();
        }

        if (headIndex == -1) {
            values[0] = value;
            headIndex = 0;
        } else {
            int targetIdx = size;
            for (int i = 0; i < size; i++) {
                if(values[i] ==  Integer.MIN_VALUE) {
                    targetIdx = i;
                }
            }
            values[targetIdx] = value;
            int currentIdx = headIndex;
            int prevIdx = -1;

            while(true) {
                int compareValue = values[currentIdx];
                if (value < compareValue) {
                    if (currentIdx == headIndex) {     // 맨 앞에 와야함
                        nexts[targetIdx] = currentIdx;
                        headIndex = size-1;
                        break;
                    } else {                           // 중간에
                        nexts[prevIdx] = targetIdx;
                        nexts[targetIdx] = currentIdx;
                        break;
                    }
                }
                if (nexts[currentIdx] ==  Integer.MIN_VALUE) {  //마지막
                    nexts[currentIdx] = targetIdx;
                    nexts[targetIdx] =  Integer.MIN_VALUE;
                    break;
                }
                prevIdx = currentIdx;
                currentIdx = nexts[currentIdx];
            }

        }

        size++;
    }

    @Override
    public int getFirst() {
        if(size == 0) {
            throw new AlreadyEmptyException();
        }

        return values[headIndex];
    }

    @Override
    public int removeFirst() {
        if(size == 0) {
            throw new AlreadyEmptyException();
        }

        int originalValue = getFirst();

        int currentIdx = headIndex;
        headIndex = nexts[headIndex];

        values[currentIdx] = Integer.MIN_VALUE;
        nexts[currentIdx] = Integer.MIN_VALUE;

        size--;

        return originalValue;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        OrderedArrayList list = new OrderedArrayList(5);

        list.insert(1);
        System.out.println("1을 넣었습니다.");
        list.insert(2);
        System.out.println("2를 넣었습니다.");
        list.insert(3);
        System.out.println("3을 넣었습니다.");
        list.insert(4);
        System.out.println("4를 넣었습니다.");
        list.insert(5);
        System.out.println("5를 넣었습니다.");

        try {
            list.insert(6);
        } catch(RuntimeException ignore) {
            System.out.println("공간이 부족해 6을 추가할 수 없습니다.");
        }

        System.out.println(list.removeFirst() + "을/를 제거하였습니다.");
        System.out.println(list.removeFirst() + "을/를 제거하였습니다.");
        System.out.println(list.removeFirst() + "을/를 제거하였습니다.");
        System.out.println(list.removeFirst() + "을/를 제거하였습니다.");
        System.out.println(list.removeFirst() + "을/를 제거하였습니다.");
        try {
            System.out.println(list.removeFirst() + "을/를 제거하였습니다.");
        } catch(RuntimeException ignore) {
            System.out.println("list에 제거할 요소가 없습니다.");
        }
    }
}
