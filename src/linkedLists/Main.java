package linkedLists;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);

//        myLinkedList.removeLast();
//        myLinkedList.append(5);
//        myLinkedList.append(6);
//        myLinkedList.append(7);
//        myLinkedList.append(10);

        myLinkedList.printList();

        myLinkedList.prepend(8);


        myLinkedList.removeLast();



//        myLinkedList.removeLast();
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

        myLinkedList.printList();




    }
}
