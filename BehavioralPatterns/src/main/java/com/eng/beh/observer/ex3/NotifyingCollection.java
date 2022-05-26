package com.eng.beh.observer.ex3;

import java.util.*;


/**
 * Created by servicium on 07.10.2016.
 */
public final class NotifyingCollection<E> implements Collection<E> {

    private Collection c;

    private final Collection subscribers = new LinkedList();

    public interface Subscriber {
        void addItem(Object item);
        void removeItem(Object item);
    }

    public synchronized void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public synchronized void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    private void notify(boolean add, Object o){
    Object[] copy;
        synchronized (this){
            copy = subscribers.toArray();
        }
        for (int i=0; i < copy.length; ++i){
            if (add)
                ((Subscriber)copy[i]).addItem(o);
            else
                ((Subscriber)copy[i]).removeItem(o);
        }
    }

    public boolean add(Object o){
        notify(true, o);
        return c.add(o);
    }

    public boolean remove(Object o)
    {
        notify(false, o);
        return c.remove(o);
    }

    public NotifyingCollection(Collection wrap){
        this.c = wrap;
    }

    public boolean addAll(Collection items) {
        Iterator i = items.iterator();
        while (i.hasNext())
            notify(true, i.next());
        return c.addAll(items);
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }



    public void clear() {

    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
