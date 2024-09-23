package linkedLists;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {

    class Node {
        int value;
        Node next;


        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        } else {
            return false;
        }
    }




    //TODO - precisa ser finalizado
    public void partitionList(int x) {
        if (head == null) {
            return;
        }
        
    }

    //TODO - precisa ser finalizado
    public void reverseBetween(int m, int n) {
        Node inicio = null;
        Node fim = null;



        inicio = get(m);
        fim = get(n);

        Node x = inicio;
        Node y = fim;

        Node temp = inicio;
        Node before = null;
        Node after = x.next;

        for (int i = m; i < n; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

        printList();
    }

    public Node findMiddleNode() {
        Node slow = head;
        Node fast = head;

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;

    }

    public void removeDuplicates() {
        Node node = head;

        HashSet<Node> mySet = new HashSet<>();
        while (node != null) {
            mySet.add(node);
            node = node.next;
        }

    }

    public int binaryToDecimal() {
        Node node = head;
        double total = 0;
        int n = length - 1;
        while (node != null) {
            double valorCasa = node.value * Math.pow(2, n);
            total = total + valorCasa;
            n--;
            node = node.next;
        }
        return (int) total;
    }

    public Node findKthFromEnd(int k) {
        Node slow = head;
        Node fast = head;

        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        for (int i = 0; i < k; i++) {
            if (fast == null) return null;
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;

        }
        return slow;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if (length == 0) {
            tail = null;
        }

        return temp;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }

        Node temp = head;
        Node pre = head;
        while (temp.next != null) { //esse é o último
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;

        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value);
            System.out.print(" ");
            temp = temp.next;
        }
        System.out.println("");
    }

    public void getHead() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (length == 0) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

}
