package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class WhenCreatingANewDog {
    @Test
    public void it_should_have_a_name() {
        LocalDateTime birthday = LocalDateTime.now();

        Dog fido = new Dog("Fido", "Poodle", birthday);

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Poodle", fido.getBreed());
        Assert.assertEquals(birthday, fido.getDateOfBirth());
    }

    @Test
    public void it_should_have_an_optional_favourite_food() {
        LocalDateTime birthday = LocalDateTime.now();

        Dog fido = new Dog("Fido", "Poodle", birthday, "pizza");

        Assert.assertEquals("pizza", fido.getFavouriteFood());
    }
}
