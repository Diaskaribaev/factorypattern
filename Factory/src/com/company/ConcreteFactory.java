package com.company;

public class ConcreteFactory extends AnimalFactory {

    @Override
    public Animal getAnimalType(String type)  {
        switch (type) {
            case "Cat":
                return new Cat();
            case "Tiger":
                return new Tiger();
            default:
                throw new RuntimeException("Animal type : " + type + " cannot be instantiated");
        }
    }

}
