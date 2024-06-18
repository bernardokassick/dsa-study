package stacks;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(5);

        myStack.push(4);
        myStack.push(3);

        myStack.printStack();
        myStack.getTop();

        myStack.pop();
        myStack.printStack();
        myStack.getTop();
        myStack.pop();
        myStack.printStack();
        myStack.getTop();
    }


}
