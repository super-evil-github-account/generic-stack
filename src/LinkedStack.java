public class LinkedStack {

    private Node head;
    private Node last;
    private int size;

    public LinkedStack() {
        head = new Node(null);
        last = head;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public <T> void push(T data){
        Node newNode = new Node(data);

        if (isEmpty()){

            head.setNext(newNode);
            last = newNode;

        } else {

            Node temp = head.getNext();
            newNode.setNext(temp);
            head.setNext(newNode);
        }

        size++;
        System.out.println(newNode.toString());
    }

    public <T>T poll(){

        if (isEmpty()){
            throw new NullPointerException();
        }

        Node popped = null;

        if (size == 1){
            popped = head.getNext();
            head.setNext(last);
        }

        if (size > 1){
            popped = head.getNext();
            head.setNext(head.getNext().getNext());
        }

        size--;
        System.out.println(popped.toString());

        return (T) popped;
    }

    public <T> T peek(){

        if (size == 0){
            throw new NullPointerException();
        }

        return (T) head.getNext();
    }

    public void delete(){
        head = null;
        last = null;
        size = 0;
    }
}
