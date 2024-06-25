package NHN.자바클래식.코딩테스트.insub2004_240624.example.exam5;

import java.util.Objects;

public class OrderedLinkedList<T extends Comparable<T>> implements List<T> {

    class Node<T> {
        T value;
        Node<T> next;

        private void setValue(T value) {
            this.value = value;
        }

        private void setNext(Node nextNode) {
            next = nextNode;
        }
    }

    int size;
    Node<T> head;

    OrderedLinkedList () {
        size = 0;
        head = null;
    }

    @Override
    public void insert(T value) {
        Node<T> newNode = new Node<>();
        newNode.setValue(value);
        newNode.setNext(null);

        if (Objects.isNull(head)) {
            head = newNode;
        } else {
            Node<T> prevNode = null;
            Node<T> compareNode = head;

            while(true) {
                if (newNode.value.compareTo(compareNode.value) < 0) {
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
                if (Objects.isNull(compareNode.next)) {
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
    public T getFirst() {
        return head.value;
    }

    @Override
    public T removeFirst() {

        Node<T> node = head;
        head = head.next;

        size--;

        return node.value;
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
