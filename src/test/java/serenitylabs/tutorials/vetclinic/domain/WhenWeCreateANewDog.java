package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class WhenWeCreateANewDog {
    @Test
    public void a_new_dog_should_have_a_name() {
        LocalDateTime THE_FOURTH_OF_JULY = LocalDateTime.of(2021,7,4,0,0);
        Dog jasper = Dog.called("Jasper").ofBreed("Poodle").bornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Jasper", jasper.getName());
        Assert.assertEquals(THE_FOURTH_OF_JULY, jasper.getDateOfBirth());
        Assert.assertEquals("Poodle", jasper.getBreed());

    }

    @Test
    public void a_dog_can_have_an_optional_colour() {
        LocalDateTime THE_FOURTH_OF_JULY = LocalDateTime.of(2021,7,4,0,0);

        Dog fido = Dog.called("Fido")
                .ofBreed("Labrador")
                .ofColour("black")
                .bornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Labrador", fido.getBreed());
        Assert.assertEquals("black", fido.getColour());
        Assert.assertEquals(THE_FOURTH_OF_JULY, fido.getDateOfBirth());

    }
}
