package modul05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class queue_todoList<E> {
    private Queue<E> queueList;
        //constructor
    public queue_todoList() {
        queueList = new LinkedList<E>();
    }
        // add object to queue
    public void enqueue(E object) {
    queueList.add(object);
    }
        // remove object from queue
    public E dequeue() throws NoSuchElementException {
    return queueList.remove();
    }
       // determine if queue is empty
    public boolean isEmpty() {
    return queueList.isEmpty();
    }
        // output queue contents
    public void printQueue() {
        Iterator<E> iterator = queueList.iterator();
        while (iterator.hasNext()) {
        Object value = iterator.next();
        System.out.println(value);
        }
     }

}
