public class Main {
    public static void main(String[] args) {
        MyArrayStack myStack = new MyArrayStack(3);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.show(); //1 2 3
        System.out.println();
        myStack.pop();
//      -----------------------------
        myStack.show(); //1 2
        System.out.println();
        myStack.pop();
//      -----------------------------
        myStack.show(); //1
        System.out.println();
        myStack.pop();
//      -----------------------------
        myStack.show(); //Stack is empty
    }
}