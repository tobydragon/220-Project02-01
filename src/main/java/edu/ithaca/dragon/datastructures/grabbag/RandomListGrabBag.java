package edu.ithaca.dragon.datastructures.grabbag;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class RandomListGrabBag<T> implements GrabBag<T> {
    private static Random randomChooser = new Random();
    
    private List<T> items;

    public RandomListGrabBag(){
        items = new ArrayList<>();
    }

    @Override
    public void putSomethingIn(T item) {
        items.add(randomChooser.nextInt(items.size()+1), item);
    }

    @Override
    public T takeSomethingOut() {
        if (isEmpty()){
            throw new NoSuchElementException("Can't takeSomethingOut of an empty GrabBag");
        }
        else {
            return items.remove(randomChooser.nextInt(items.size()));
        }
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public void makeEmpty() {
        items.clear();        
    }
    
}
