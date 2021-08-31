package edu.ithaca.dragon.datastructures.grabbag;

public interface GrabBag<T> {

    /**
     * @post puts an item into the GrabBag
     */
    void putSomethingIn(T item);

    /**
     * @post removes any item from the GrabBag (no guarentee about order, could be any item) 
     * @return the item removed
     * @throws NoSuchElementException if the GrabBag is empty
     */
    T takeSomethingOut();

     /**
     * @return true if the GrabBag has no items, false otherwise
     */
    boolean isEmpty();

    /**
     * dumps the GrabBag
     * After calling, all items are removed, the GrabBag is empty
     */
    void makeEmpty();
}
