

import java.util.ArrayList;
import java.util.NoSuchElementException;
//----------------------------------------------------- 
// Title: queue class
// Author: Berke Beyazbenli
// ID: 10022751132
// Section: 1
// Assignment: 1
// Description: queue implementation
public class Queue<T> {
        //-------------------------------------------------------- 
// Summary: queue implementation and other methods
// 
// Precondition: 
// 
// Postcondition:  
//--------------------------------------------------------
private ArrayList<T> queue;

    public Queue() {
        queue = new ArrayList<T>();
    }

    public void add(T item) {
        queue.add(item);
    }

    public boolean isEmpty() {
        if (queue.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public T remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue.remove(0);
    }

    public T peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue.get(0);
    }

    public int size() {
        return queue.size();
    }

    public void printQueue() {
        for (T item : queue) {
            System.out.println(item);
        }
    }

  
    
}


