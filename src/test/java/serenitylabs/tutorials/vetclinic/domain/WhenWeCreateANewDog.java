package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

public class WhenWeCreateANewDog {
    @Test
    public void a_new_dog_should_have_a_name() {
        Dog jasper = new Dog("Jasper");

        Assert.assertEquals("Jasper", jasper.getName());
    }
}
