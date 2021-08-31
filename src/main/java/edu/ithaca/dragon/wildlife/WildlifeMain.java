package edu.ithaca.dragon.wildlife;

public class WildlifeMain {
    
    public static void main(String[] args){
        Animal animal = new Animal("Sally", 4);
        System.out.println(animal.createReport());
        System.out.println(animal);
    }
}
