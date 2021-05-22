package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Dog {
    private final String name;
    private final LocalDateTime dateOfBirth;
    private final String breed;
    private final String colour;
    private final String favouriteFood;

    public Dog(String name, LocalDateTime dateOfBirth, String breed, String colour, String favouriteFood) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.breed = breed;
        this.colour = colour;
        this.favouriteFood = favouriteFood;
    }

    public static OfBreed called(String name) {
        return new DogBreeder(name);
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public String getBreed() {
        return breed;
    }

    public String getColour() {
        return colour;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public interface OfBreed {
        OfColour ofBreed(String breed);
    }

    public interface OfColour {
        DogBreeder ofColour(String colour);
    }

    public static class DogBreeder implements OfBreed, OfColour{
        private final String name;
        private String breed;
        private String colour;
        private String favouriteFood;

        public DogBreeder(String name) {

            this.name = name;
        }

        public DogBreeder ofBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public Dog bornOn(LocalDateTime dateOfBirth) {
            return new Dog(name, dateOfBirth, breed, colour, favouriteFood);
        }

        public DogBreeder ofColour(String colour) {
            this.colour = colour;
            return this;
        }

        public DogBreeder favouriteFood(String favouriteFood) {
            this.favouriteFood = favouriteFood;
            return this;
        }
    }
}
