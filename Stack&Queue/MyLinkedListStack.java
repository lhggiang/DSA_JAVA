import java.util.ArrayList;

public class MyLinkedListStack implements IStackQueue {
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }
    private Node topNode;
    public MyLinkedListStack(){
        topNode = null;
    }

    @Override
    public boolean push(int value) {
        //add the head of linked list
        Node newNode = new Node(value);
        newNode.next = topNode;
        topNode = newNode;
        return true;
    }

    @Override
    public int pop() {
        //delete the first node of linked list
        if(!isEmpty()){
            int value = topNode.value;
            topNode =  topNode.next;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void show() {
        if(isEmpty()){
            System.out.print("Stack is empty");
            return;
        }
        ArrayList<Integer> list = new ArrayList<>();
        Node tmp = topNode;
        while(tmp!=null){
//          System.out.print(tmp.value + " ");
            list.add(tmp.value);
            tmp = tmp.next;
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
