package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class WhenWeCreateANewDog {
    public static final LocalDate THE_FOURTH_OF_JULY = LocalDate.of(2021, 7, 4);

    @Test
    public void a_new_dog_should_have_a_name() {
        Dog jasper = DogBreeder.aDog()
                .called("Jasper")
                .ofBreed("Poodle")
                .ofColour("black")
                .bornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Jasper", jasper.getName());
        Assert.assertEquals("Poodle", jasper.getBreed());
        Assert.assertEquals("black", jasper.getColour());
        Assert.assertEquals(THE_FOURTH_OF_JULY, jasper.getDateOfBirth());
    }

    @Test
    public void a_dog_can_have_an_optional_favourite_food() {

        Dog jasper = DogBreeder.aDog()
                .called("Jasper")
                .ofBreed("Poodle")
                .ofColour("black")
                .favouriteFood("homework")
                .bornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Jasper", jasper.getName());
        Assert.assertEquals("Poodle", jasper.getBreed());
        Assert.assertEquals("black", jasper.getColour());
        Assert.assertEquals("homework", jasper.getFavouriteFood());
        Assert.assertEquals(THE_FOURTH_OF_JULY, jasper.getDateOfBirth());
    }

    @Test
    public void a_dog_can_have_an_optional_favourite_toy() {
        Dog jasper = DogBreeder.aDog()
                .called("Jasper")
                .ofBreed("Poodle")
                .ofColour("black")
                .favouriteToy("Stuffed Bunny")
                .bornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Jasper", jasper.getName());
        Assert.assertEquals("Poodle", jasper.getBreed());
        Assert.assertEquals("black", jasper.getColour());
        Assert.assertEquals("Stuffed Bunny", jasper.getFavouriteToy());
        Assert.assertEquals(THE_FOURTH_OF_JULY, jasper.getDateOfBirth());
    }
}
