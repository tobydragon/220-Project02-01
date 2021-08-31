package edu.ithaca.dragon.wildlife;

public class Animal {
    private String name;
    private int weight;
    
    public Animal(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return name + ":" + weight;
    }

    public String createReport(){
        String response = name + " weighs " + weight + " pounds";
        return  response;
    }

    public void eat(){
        weight +=3;
    }

    public int getWeight(){
        return 4;
    }
}