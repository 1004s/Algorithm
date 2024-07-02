package NHN.자바클래식.코딩테스트.caboooom_240624.exam.src.example.ex5;

import java.util.NoSuchElementException;

public class OrderedLinkedList <T extends Comparable<T>> implements List<T> {

    private Node<T> head;
    private int size;

    private static class Node<T> {
        private T value;
        private Node<T> next;

        private Node(T value) {
            this.value = value;
        }

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    public OrderedLinkedList() {
        this.size = 0;
    }

    @Override
    public void insert(T value) {
        if(size == 0) {
            head = new Node<>(value);
            size++;
            return;
        }
        if(value.compareTo(head.value) < 0) {
            this.head = new Node<>(value, new Node<>(head.value, head.next));
            size++;
            return;
        }

        Node<T> current = head;
        while(current.next != null) {
            if(current.next.value.compareTo(value) > 0) {
                // insert and return
                current.next = new Node<>(value, current.next);
                size++;
                return;
            }
            current = current.next;
        }
        // insert
        current.next = new Node<>(value);
        size++;
    }

    @Override
    public T getFirst() {
        if(size == 0) {
            throw new NoSuchElementException();
        }
        return head.value;
    }

    @Override
    public T removeFirst() {
        if(size == 0) {
            throw new NoSuchElementException();
        }
        T headValue = head.value;
        if(size > 1) {
            head = head.next;
        }
        size--;
        return headValue;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        OrderedLinkedList<Student> students = new OrderedLinkedList<>();

        students.insert(new Student("s2", 2));
        students.insert(new Student("s3", 3));
        students.insert(new Student("s1", 1));

        System.out.println(students.removeFirst().getId());
        System.out.println(students.removeFirst().getId());
        System.out.println(students.removeFirst().getId());

    }
}
