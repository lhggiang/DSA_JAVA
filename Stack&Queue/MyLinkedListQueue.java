import java.util.ArrayList;

public class MyLinkedListQueue implements IStackQueue {
    private class Node {
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }

    private Node headNode, tailNode;
    public MyLinkedListQueue(){
        headNode =  tailNode = null;
    }

    @Override
    public boolean push(int value) {
        Node newNode = new Node(value);
        if(isEmpty()){
           tailNode = headNode = newNode;
        }
         else {
            tailNode.next = newNode;
            tailNode = newNode;
        }
      return true;
    }

    @Override
    public int pop() {
        //delete the first node of linked list
        int value = -1;
        if(!isEmpty()){
            value = headNode.value;
            //only one element
            if(headNode == tailNode){
                headNode = tailNode = null;
            } else {
                headNode = headNode.next;
            }
            return value;
        }
        return value;
    }

    @Override
    public boolean isEmpty() {
        return headNode == null && tailNode == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void show() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        Node tmp = headNode;
        while(tmp!=null){
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }

        System.out.println();
    }
}
