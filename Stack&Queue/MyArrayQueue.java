public class MyArrayQueue implements IStackQueue{
    private int headIndex;
    private int tailIndex;
    private int SIZE;
    private int[] array;

    public MyArrayQueue(int size){
        headIndex = -1;
        tailIndex = -1;
        SIZE = size;
        array = new int[SIZE];
    }

    @Override
    public boolean push(int value) {
        if(isFull()){
            if(isEmpty()){
                ++headIndex;
            }
            array[++tailIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value = -1;
        if(!isEmpty()){
            value=array[headIndex];
            ++headIndex;
            if(headIndex > tailIndex){ //head and tail point the same place
               headIndex = tailIndex = -1;
            }
        }
        return value;
    }

    @Override
    public boolean isEmpty() {
        return headIndex == -1 && tailIndex == -1;
    }

    @Override
    public boolean isFull() {
        return tailIndex == SIZE-1;
    }

    @Override
    public void show() {
        if(!isEmpty()){
           for(int i = headIndex; i <= tailIndex; ++i){
               System.out.print(array[i]+" ");
           }
        } else {
            System.out.print("Queue is empty");
        }
    }

    public int count(){
        if(isEmpty()){
            return 0;
        }
        return tailIndex-headIndex+1;
    }
}
