public class DoublyLinkedList<V> {
    private Node<V> head=null;
    private Node<V> tail=null;
    private int size=0;

    public void append(V value){
        Node<V> node = new Node<>(value);
        //if this is first item, point the head to this and exit
        if(head==null){
            head = node;
        }else {
            node.prev = tail;
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    public int size(){
        return size;
    }


    private static class Node<V>{
        private V value;
        private Node<V> next=null;
        private Node<V> prev=null;

        Node(V value) {
            this.value = value;
        }

        void setNext(Node<V> node){
            this.next = node;
        }

        void setPrev(Node<V> node){
            this.prev = node;
        }

        Node<V> next(){
            return next;
        }

        Node<V> prev(){
            return prev;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<V> node = head;
        int i=0;
        while(i++<size){
            builder.append("Node: ")
                    .append(node.value)
                    .append(" Next Node: ")
                    .append(node.next)
                    .append(" Prev Node: ")
                    .append(node.prev)
                    .append("\n");
            node = node.next();
        }
        return builder.toString();
    }

}
