package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Dog {
    private final String name;
    private final LocalDateTime dateOfBirth;
    private final String breed;

    public Dog(String name, LocalDateTime dateOfBirth, String breed) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.breed = breed;
    }

    public static DogBreeder called(String name) {
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

    public static class DogBreeder {
        private final String name;
        private String breed;
        private LocalDateTime dateOfBirth;

        public DogBreeder(String name) {

            this.name = name;
        }

        public DogBreeder ofBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public Dog bornOn(LocalDateTime dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return new Dog(name, dateOfBirth, breed);
        }
    }
}
