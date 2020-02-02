import java.util.Optional;

public class Queue<V> {
    private int capacity=100;
    private V[] ringBuffer;
    private int start=0;       //add elements from this point
    private int end=0;         //consume elements from this point.
    private int size=0;


    public Queue(int capacity){
        this.capacity = capacity;
        init();
    }


    public Queue(){
        init();
    }

    private void init(){
        //noinspection MoveFieldAssignmentToInitializer
        ringBuffer= (V[]) new Object[capacity];
    }

    public void enqueue(V elem){
        if(isFull()){
            upSizeBuffer();
        }
        insertElem(elem);
    }

    private void insertElem(V elem){
        if(start == capacity){
            start = 0;
        }
        ringBuffer[start++] = elem;
        size++;
    }

    private void upSizeBuffer() {
        capacity = capacity * 2;    //TODO - gaurd against overflow.
        V[] newBuffer = (V[]) new Object[capacity];
        int i=0;
        for (V item : ringBuffer){
            newBuffer[i++] = item;
        }
        ringBuffer = newBuffer;
    }

    private boolean isFull() {
        return size == capacity;
    }

    public Optional<V> dequeue(){
        if (size > 0){
            return removeElem();
        }
        return Optional.empty();
    }

    private Optional<V> removeElem() {
        if(end == capacity)
            end = 0;

        size--;
        return Optional.of(ringBuffer[end++]);
    }

    public Optional<V> peek(){
        if(end == capacity)
            end = 0;

        return size == 0 ? Optional.empty() : Optional.of(ringBuffer[end]);
    }

    public int size(){
        return size;
    }
}
