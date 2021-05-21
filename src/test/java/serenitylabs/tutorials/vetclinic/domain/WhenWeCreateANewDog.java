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
}
