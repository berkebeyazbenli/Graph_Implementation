import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
//----------------------------------------------------- 
// Title: bag class
// Author: Berke Beyazbenli
// ID: 10022751132
// Section: 1
// Assignment: 1
// Description: bag implementation
class Bag<T> implements Iterable<T>{
        //-------------------------------------------------------- 
// Summary: bagimplementation and other methods
// 
// Precondition: 
// 
// Postcondition:  
//--------------------------------------------------------
    
    private List<T> items;

    public Bag() {
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

            
    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }
    public void remove(T item) {
        items.remove(item);
    }

}


