import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        ------------------------- Enque Interface -------------------------
        /*Queue<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.offer(30);
        for(Integer it : numbers){
            System.out.print(it + " "); //10 20 30
        }
        numbers.poll(); //10
        System.out.println(numbers.peek()); //20*/
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(3);
        numbers.add(7);

        System.out.println("Danh sách ban đầu: ");
        for (Integer i: numbers) {
            System.out.print(i + "\t"); //3 7 5 9
        }

        System.out.println("\nPhần tử đầu tiên: " + numbers.poll()); //3

        numbers.offer(1);
        System.out.println("\nDanh sách ban đầu: ");
        for (Integer i: numbers) {
            System.out.print(i + "\t"); // 1 5 9 7
        }

//        ------------------------- Deque Interface -------------------------
//        Stack<Integer> stack = new Stack<>();
//        Deque<Integer> deque = new ArrayDeque<>();
//
//        stack.push(1);
//        deque.push(1);
//        stack.push(2);
//        deque.push(2);
//
//        List<Integer> list1 = stack.stream().collect(Collectors.toList());//[1,2]
//        for(int i = 0; i < list1.size(); i++){
//            System.out.print(list1.get(i) + " " );
//        }
//        System.out.println();
//
//        List<Integer> list2 = deque.stream().collect(Collectors.toList());//[2,1]
//        for(int i = 0; i < list2.size(); i++){
//            System.out.print(list2.get(i) + " " );
//        }

//        ------------------------- Stack Class -------------------------
//        Stack<Integer> myStack = new Stack<>();
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        System.out.println(myStack.pop()); //3 removing element
//        System.out.println(myStack.peek()); //2 accessing the element
//        //Duyệt theo thứ tự thêm vào, không theo LIFO
//        for(Integer item : myStack){
//            System.out.print(item + " "); //1 2
//        }
//        // Lấy các phần tử ra theo thứ tự LIFO
//        while (!myStack.isEmpty()) {
//            System.out.print(myStack.pop() + " "); //3 2 1
//        }
//        System.out.println(myStack.empty());

//      ---------------------------------------------------------------------------
        /*MyLinkedListQueue myLinkedListQueue = new MyLinkedListQueue();
        myLinkedListQueue.push(1);
        myLinkedListQueue.push(2);
        myLinkedListQueue.push(3);
        myLinkedListQueue.show(); //1 2 3
        myLinkedListQueue.pop();
//      -----------------------------
        myLinkedListQueue.show(); //2 3
        myLinkedListQueue.pop();
//      -----------------------------
        myLinkedListQueue.show(); //3
        myLinkedListQueue.pop();
//      -----------------------------
        myLinkedListQueue.show(); //Queue is empty*/

//      ---------------------------------------------------------------------------
        /*MyLinkedListStack myLinkedListStack = new MyLinkedListStack();
        myLinkedListStack.push(1);
        myLinkedListStack.push(2);
        myLinkedListStack.push(3);
        myLinkedListStack.show(); //1 2 3
        myLinkedListStack.pop();
//      -----------------------------
        myLinkedListStack.show(); //1 2
        myLinkedListStack.pop();
//      -----------------------------
        myLinkedListStack.show(); //1
        myLinkedListStack.pop();
//      -----------------------------
        myLinkedListStack.show(); //Stack is empty*/

//      ---------------------------------------------------------------------------
        /*MyArrayQueue myQueue = new MyArrayQueue(3);
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.show(); //1 2 3
        myQueue.pop();
//      -----------------------------
        myQueue.show(); //2 3
        myQueue.pop();
//      -----------------------------
        myQueue.show(); //3
        myQueue.pop();
//      -----------------------------
        myQueue.show(); //Queue is empty*/

//      ---------------------------------------------------------------------------
        /*MyArrayStack myStack = new MyArrayStack(3);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.show(); //1 2 3
        myStack.pop();
//      -----------------------------
        myStack.show(); //1 2
        myStack.pop();
//      -----------------------------
        myStack.show(); //1
        myStack.pop();
//      -----------------------------
        myStack.show(); //Stack is empty*/
    }
}