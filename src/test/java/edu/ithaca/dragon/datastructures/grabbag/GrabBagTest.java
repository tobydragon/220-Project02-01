package edu.ithaca.dragon.datastructures.grabbag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

import edu.ithaca.dragon.wildlife.Animal;

public class GrabBagTest {
        
    @Test
    public void simplePutTakeTest(){
        GrabBag<String> myGrabBag = new RandomListGrabBag<>();
        myGrabBag.putSomethingIn("Maria");
        assertEquals("Maria", myGrabBag.takeSomethingOut());

        assertThrows(NoSuchElementException.class, ()-> myGrabBag.takeSomethingOut() );

        GrabBag<Animal> animalGrabBag = new RandomListGrabBag<>();
        animalGrabBag.putSomethingIn(new Animal("Sally", 4));
        Animal backOutOfBag = animalGrabBag.takeSomethingOut();
        assertEquals(4, backOutOfBag.getWeight());
    }

}
