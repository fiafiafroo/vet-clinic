package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;

public class Dog {

    private final String name;
    private final String breed;
    private final LocalDate dateOfBirth;
    private final String favouriteFood;
    private final String colour;
    private final String favouriteToy;

    Dog(String name, String breed, LocalDate dateOfBirth, String favouriteFood, String colour, String favouriteToy) {

        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.favouriteFood = favouriteFood;
        this.colour = colour;
        this.favouriteToy = favouriteToy;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return breed;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public String getColour() {
        return colour;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

}
