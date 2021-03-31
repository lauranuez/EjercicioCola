package cola;

public class QueueImp<E> implements Queue<E> {

    private E[] vector;
    public int pos; //posicion libre
    public int num; //numero posiciones en la cola

    public void QueueDefinition(int n)
    {
        vector =  (E[]) new Object[n];
        pos = 0;
    }


    @Override
    public int GetSize() {
        int size = vector.length;
        return size;
    }

    @Override
    public void Push(E e) throws FullQueueException{
        if (pos < num)
        {
            vector[pos]= e;
            pos ++;
        }
        else
            throw new FullQueueException();

    }

    @Override
    public E[] Pop() throws EmptyQueueException{
        if(pos!=0)
        {
            vector[0]=null;

            for(int i=0 ;i<pos-1; i++)
            {
                vector[i]=vector[i+1];
            }
            pos = pos-1;
            return vector;
        }
        else
            throw new EmptyQueueException();

    }

}
