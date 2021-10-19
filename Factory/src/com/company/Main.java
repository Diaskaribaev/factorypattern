package com.company;

public class Main {

    public static void main(String[] args)  {
        AnimalFactory animalFactory = new ConcreteFactory();
        Animal catType = animalFactory.getAnimalType("Cat");
        catType.speak();

        Animal tigerType = animalFactory.getAnimalType("Tiger");
        tigerType.speak();


        Animal lionType = animalFactory.getAnimalType("Lion");
        lionType.speak();
    }
}
