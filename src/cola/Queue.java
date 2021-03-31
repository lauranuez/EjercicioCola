package cola;

public interface Queue<E> {

    public int GetSize();
    public void Push(E e) throws FullQueueException;
    public E[] Pop() throws EmptyQueueException;

}
