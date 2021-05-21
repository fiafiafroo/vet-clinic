package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class WhenWeCreateANewDog {
    @Test
    public void a_new_dog_should_have_a_name() {
        LocalDateTime birthday = LocalDateTime.now();
        Dog jasper = new Dog("Jasper", birthday);

        Assert.assertEquals("Jasper", jasper.getName());
        Assert.assertEquals(birthday, jasper.getDateOfBirth());

    }
}
