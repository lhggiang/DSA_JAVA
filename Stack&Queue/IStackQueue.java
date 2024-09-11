public interface IStackQueue {
    public boolean push(int value); //state success or not
    public int pop(); //element is deleted
    public boolean isEmpty();
    public boolean isFull();
    public void show();
}
