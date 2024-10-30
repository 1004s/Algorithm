package NHN.자바클래식.코딩테스트.caboooom_240624.exam.src.example.ex3_4;

import example.ex2.List;

import java.util.NoSuchElementException;

public class OrderedArrayList implements List {

    private final int capacity;
    private int size;
    private int headIdx;
    private int[] values;
    private int[] nexts;

    public OrderedArrayList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.headIdx = -1;
        this.values = new int[capacity];
        this.nexts = new int[capacity];
    }

    @Override
    public void insert(int value) {
        if(size >= capacity) {
            throw new IndexOutOfBoundsException();
        }
        if(size == 0) {
            headIdx = 0;
            values[headIdx] = value;
            nexts[headIdx] = -9;
            size++;
            return;
        }
        if(value < values[headIdx]) {
            values[size] = value;
            nexts[size] = headIdx;
            this.headIdx = size;
            size++;
            return;
        }

        int currentIdx = headIdx;
        while(nexts[currentIdx] != -9) {
            if(values[nexts[currentIdx]] > value) {
                // insert and return
                values[size] = value;
                nexts[size] = nexts[currentIdx];
                nexts[currentIdx] = size;
                size++;
                return;
            }
            currentIdx = nexts[currentIdx];
        }
        // insert
        values[size] = value;
        nexts[size] = -9;
        nexts[currentIdx] = size;
        size++;
    }

    @Override
    public int getFirst() {
        if(size == 0) {
            throw new NoSuchElementException();
        }
        return values[headIdx];
    }

    @Override
    public int removeFirst() {
        if(size == 0) {
            throw new NoSuchElementException();
        }
        int headValue = values[headIdx];
        int headNext = nexts[headIdx];
        // 빈 공간이 없도록, 배열의 맨 뒤 값을 head 자리로 이동
        if(headIdx != size - 1) {
            values[headIdx] = values[size - 1];
            nexts[headIdx] = nexts[size - 1];
        }
        if(headNext != size - 1) {
            headIdx = headNext;
        }
        values[size-1] = 0;
        nexts[size-1] = 0;
        size--;
        return headValue;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // ex3. main
//    public static void main(String[] args) {
//        OrderedArrayList list = new OrderedArrayList(10);
//
//        System.out.println("isEmpty : " + list.isEmpty()); // true
//        list.insert(10); // [10]
//        list.insert(5); // [5, 10]
//        System.out.println("getFirst : " + list.getFirst()); // 5
//        list.insert(7); // [5, 7, 10]
//        list.removeFirst(); // [7, 10]
//        System.out.println("isEmpty : " + list.isEmpty()); // false
//        System.out.println("getFirst : " + list.getFirst()); // 7
//        list.insert(12); // [7, 10, 12]
//        list.insert(3); // [3, 7, 10, 12]
//        System.out.println("getFirst : " + list.getFirst()); // 3
//        list.removeFirst(); // [7, 10, 12]
//        System.out.println("getFirst : " + list.getFirst()); // 7
//        list.removeFirst(); // [10, 12]
//        System.out.println("getFirst : " + list.getFirst()); // 10
//        list.removeFirst(); // [12]
//        System.out.println("isEmpty : " + list.isEmpty()); // false
//
//    }

    // ex4. main
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
