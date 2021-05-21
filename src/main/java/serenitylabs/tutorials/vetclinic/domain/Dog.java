package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Dog {
    private final String name;
    private final LocalDateTime dateOfBirth;

    public Dog(String name, LocalDateTime dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }
}
