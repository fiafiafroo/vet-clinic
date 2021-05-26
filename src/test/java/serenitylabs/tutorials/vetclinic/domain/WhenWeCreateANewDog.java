package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class WhenWeCreateANewDog {

    @Test
    public void a_new_dog_should_have_a_name_and_a_breed_and_a_colour() {
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");


        assertThat(fido.getName(), is(equalTo("Fido")));
        assertThat(fido.getBreed(), is(equalTo("Labrador")));
        assertThat(fido.getColour(), contains("Black"));
    }

    @Test
    public void a_dog_should_be_printed_in_a_readable_form() {
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");

        assertThat(fido.toString(), is(equalToIgnoringCase("Fido the black labrador")));

        assertThat(fido.toString(), startsWith("Fido"));
        assertThat(fido.toString(), endsWith("Labrador"));
        assertThat(fido.toString(), containsString("Black"));
    }

    @Test
    public void a_dog_can_have_several_colours() {
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black", "White");

        assertThat(fido.getColour(), contains("Black","White"));
        assertThat(fido.getColour(), hasItem("Black"));
        assertThat(fido.getColour(), not(hasItem("Red")));
    }
}
