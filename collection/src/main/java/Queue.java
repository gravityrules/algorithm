import java.util.Optional;

public class Queue {
    private int capacity=100;
    private Object[] ringBuffer;
    private int start=-1;       //add elements from this point
    private int end=-1;         //consume elements from this point.
    private int size=0;

    public Queue(int capacity){
        this.capacity = capacity;
        ringBuffer= new Object[capacity];
    }
    public Queue(){
        ringBuffer = new Object[capacity];
    }

    public void enqueue(Object elem){

    }

    public Optional<Object> dequeue(){
        return Optional.empty();
    }

    public Optional<Object> peek(){
        return end < 0 ? Optional.empty() : (Optional<Object>) ringBuffer[end];
    }

    public int size(){
        return size;
    }
}
