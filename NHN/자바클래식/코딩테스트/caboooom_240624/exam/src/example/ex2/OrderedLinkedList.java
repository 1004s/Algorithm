package NHN.자바클래식.코딩테스트.caboooom_240624.exam.src.example.ex2;

import java.util.NoSuchElementException;

public class OrderedLinkedList implements List {

    private Node head;
    private int size;

    private class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public OrderedLinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public void insert(int value) {
        if(size == 0) {
            head = new Node(value);
            size++;
            return;
        }
        if(value < head.value) {
            this.head = new Node(value, new Node(head.value, head.next));
            size++;
            return;
        }

        Node current = head;
        while(current.next != null) {
            if(current.next.value > value) {
                // insert and return
                Node node = new Node(value, current.next);
                current.next = node;
                size++;
                return;
            }
            current = current.next;
        }
        // insert
        current.next = new Node(value);
        size++;

    }

    @Override
    public int getFirst() {
        if(size == 0) {
            throw new NoSuchElementException();
        }
        return head.value;
    }

    @Override
    public int removeFirst() {
        if(size == 0) {
            throw new NoSuchElementException();
        }
        int headValue = head.value;
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
        OrderedLinkedList list = new OrderedLinkedList();

        System.out.println("isEmpty : " + list.isEmpty());
        list.insert(10);
        list.insert(5);
        System.out.println("getFirst : " + list.getFirst());
        list.insert(7);
        list.removeFirst();
        System.out.println("isEmpty : " + list.isEmpty());
        System.out.println("getFirst : " + list.getFirst());
        list.insert(12);
        list.insert(3);
        System.out.println("getFirst : " + list.getFirst());
        list.removeFirst();
        System.out.println("getFirst : " + list.getFirst());
        list.removeFirst();
        System.out.println("getFirst : " + list.getFirst());
        list.removeFirst();
        System.out.println("getFirst : " + list.getFirst());
        list.removeFirst();
        System.out.println("isEmpty : " + list.isEmpty());
    }
}
