package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class WhenCreatingANewDog {

    private final static LocalDate THE_FOURTH_OF_JULY = LocalDate.of(2021, 7,4);

    @Test
    public void it_should_have_a_name_a_breed_a_colour_and_a_date_of_birth() {

        Dog fido = DogBreeder.aLargeDog()
                .called("Fido")
                .ofColour("Black")
                .bornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Labrador", fido.getBreed());
        Assert.assertEquals("Black", fido.getColour());
        Assert.assertEquals(THE_FOURTH_OF_JULY, fido.getDateOfBirth());

    }

    @Test
    public void a_dog_can_have_an_optional_favourite_food() {
        Dog fido = DogBreeder.aSmallDog()
                .called("Spot")
                .ofColour("Black")
                .withFavouriteFood("pizza")
                .bornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Spot", fido.getName());
        Assert.assertEquals("Poodle", fido.getBreed());
        Assert.assertEquals("Black", fido.getColour());
        Assert.assertEquals("pizza", fido.getFavouriteFood());
        Assert.assertEquals(THE_FOURTH_OF_JULY, fido.getDateOfBirth());
    }

    @Test
    public void a_dog_can_have_an_optional_favourite_toy() {
        Dog fido = DogBreeder.aDog()
                .called("Fido")
                .ofBreed("Poodle")
                .ofColour("Black")
                .withFavouriteToy("bone")
                .bornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Poodle", fido.getBreed());
        Assert.assertEquals("Black", fido.getColour());
        Assert.assertEquals("bone", fido.getFavouriteToy());
        Assert.assertEquals(THE_FOURTH_OF_JULY, fido.getDateOfBirth());
    }
}
