package stacks;


public class Stack {

    private Node top;
    private Node bottom;
    private int height;

    class Node {
        int value;
        Node next;


        Node(int value) {
            this.value = value;
        }
    }

    public Stack(int value) {
        Node newNode = new Node(value);
        this.top = newNode;
        this.height = 1;
    }

    // TODO: Métodos básicos

    public void push(int value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
            height = 1;
        } else {
            newNode.next = top;
            top = newNode;
            height++;
        }
    }

    public Node pop() {
        if (top == null) {
            return null;
        } else {
            Node temp = top;
            top = temp.next;
            temp.next = null;
            height--;
            return temp;
        }


    }


    // Métodos Padrões

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop() {
        System.out.println("Top: " + top.value);
    }

    public void getHeight() {
        System.out.println("Height: " + height);
    }
}
