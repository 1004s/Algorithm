package NHN.자바클래식.코딩테스트.insub2004_240624.example.exam2;

import example.exception.AlreadyEmptyException;

import java.util.Objects;

public class OrderedLinkedList implements List {

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            next = null;
        }

        public int getValue() {
            return value;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private int size;
    Node head;

    public OrderedLinkedList() {
        this.size = 0;
        head = null;
    }

    @Override
    public void insert(int value) {

        Node newNode = new Node(value);

        if (Objects.isNull(head)) {
            head = newNode;
        } else {
            Node prevNode = null;
            Node compareNode = head;

            while (true) {
                if (compareNode.value > newNode.value) {
                    if (Objects.isNull(prevNode)) {
                        newNode.setNext(head);
                        head = newNode;
                        break;
                    } else {
                        prevNode.setNext(newNode);
                        newNode.setNext(compareNode);
                        break;
                    }
                }
                if(Objects.isNull(compareNode.next)) {
                    compareNode.next = newNode;
                    break;
                }
                prevNode = compareNode;
                compareNode = prevNode.next;
            }
        }
        size++;
    }

    @Override
    public int getFirst() {
        if (Objects.isNull(head)) {
            throw new AlreadyEmptyException();
        }

        return head.value;
    }

    @Override
    public int removeFirst() {
        if (Objects.isNull(head)) {
            throw new AlreadyEmptyException();
        }

        int originalValue = head.getValue();

        head = head.next;
        size--;

        return originalValue;
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
