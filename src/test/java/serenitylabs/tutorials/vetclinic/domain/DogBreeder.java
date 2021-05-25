package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;

public class DogBreeder implements OfBreed, OfColour {
    private String name;
    private String breed;
    private String colour;
    private String favouriteFood;
    private String favouriteToy;


    public static DogBreeder aDog() {
        return new DogBreeder();
    }

    public static DogBreeder aSmallDog() {
        return aDog().ofBreed("Poodle");
    }

    public static DogBreeder aLargeDog() {
        return aDog().ofBreed("Labrador");
    }

    public static DogBreeder aGuardDog() {
        return aDog().ofBreed("Dobermann");
    }

    public DogBreeder called(String name) {
        this.name = name;
        return this;
    }

    public DogBreeder ofBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public Dog bornOn(LocalDate dateOfBirth) {
        return new Dog(name, dateOfBirth, breed, colour, favouriteFood, favouriteToy);
    }

    public DogBreeder ofColour(String colour) {
        this.colour = colour;
        return this;
    }

    public DogBreeder favouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
        return this;
    }

    public DogBreeder favouriteToy(String favouriteToy) {
        this.favouriteToy = favouriteToy;
        return this;
    }
}