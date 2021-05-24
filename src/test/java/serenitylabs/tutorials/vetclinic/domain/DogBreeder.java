package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DogBreeder implements WithBreed, WithColour {
    private String name;
    private String breed;
    private String favouriteFood;
    private String colour;
    private String favouriteToy;

    public static DogBreeder aDog() {
        return new DogBreeder();
    }

    public WithBreed called(String name) {
        this.name = name;
        return this;
    }


    public DogBreeder ofBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public Dog bornOn(LocalDate dateOfBirth) {
        return new Dog(name, breed, dateOfBirth, favouriteFood, colour, favouriteToy);
    }

    public DogBreeder withFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
        return this;
    }

    public DogBreeder ofColour(String colour) {
        this.colour = colour;
        return this;
    }

    public DogBreeder withFavouriteToy(String favouriteToy) {
        this.favouriteToy = favouriteToy;
        return this;
    }
}