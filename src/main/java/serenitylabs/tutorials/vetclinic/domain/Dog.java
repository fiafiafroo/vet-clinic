package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Dog {
    private final String name;
    private final LocalDateTime dateOfBirth;
    private final String breed;
    private final String colour;

    public Dog(String name, LocalDateTime dateOfBirth, String breed, String colour) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.breed = breed;
        this.colour = colour;
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

    public interface OfBreed {
        DogBreeder ofBreed(String breed);
    }

    public static class DogBreeder implements OfBreed{
        private final String name;
        private String breed;
        private String colour;

        public DogBreeder(String name) {

            this.name = name;
        }

        public DogBreeder ofBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public Dog bornOn(LocalDateTime dateOfBirth) {
            return new Dog(name, dateOfBirth, breed, colour);
        }

        public DogBreeder ofColour(String colour) {
            this.colour = colour;
            return this;
        }
    }
}
