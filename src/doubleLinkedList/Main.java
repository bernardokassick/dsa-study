package doubleLinkedList;

public class Main {

    public static void main(String[] args) {

        DoubleLinkedList ddl = new DoubleLinkedList(5);

        ddl.append(6);
        ddl.append(8);
        ddl.append(9);


        ddl.printList();

        ddl.getHead();
        ddl.getTail();
    }
}
