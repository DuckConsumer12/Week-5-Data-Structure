import java.util.*;


public class ListStack<E> implements StackInt<E> {
    private List<E> theData;
    public ListStack() {
        theData = new ArrayList<>();

    }
    @Override
    public E push(E obj) {
        theData.add(obj);
        return obj;
    }

    @Override
    public E peek(){
        if (isEmpty()) { throw new NoSuchElementException();}
        return theData.get(theData.size() - 1);
    }

    @Override
    public E pop() {
        if (isEmpty()) {throw new NoSuchElementException();
        }
        return theData.remove(theData.size() - 1);

    }
    @Override
    public boolean isEmpty() {
        return theData.isEmpty();

    }

    @Override 
    public String toString(){ return theData.toString();}


}
