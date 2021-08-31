package edu.ithaca.dragon.wildlife;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;


public class AnimalTest {

    @Test
    public void getWeightTest(){
        Animal animal = new Animal("Sally", 4);
        assertEquals(4, animal.getWeight());
    }

    @Test
    public void createReportTest(){
        Animal animal = new Animal("Sally", 4);
        assertNotNull(animal);
        assertEquals("Sally weighs 4 pounds", animal.createReport());
    }
    
}
