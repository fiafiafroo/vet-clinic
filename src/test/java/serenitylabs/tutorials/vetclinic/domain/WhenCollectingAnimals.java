package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class WhenCollectingAnimals {

    @Test
    public void a_list_of_animals_can_contain_cats_and_dogs() {
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");
        Cat felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("White");

        List<Animal> animals = new ArrayList<>();
        animals.add(fido);
        animals.add(felix);

        assertThat(animals, hasItems(felix, fido));
    }

    @Test
    public void a_dog_complains_by_growling() {
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");

        assertThat(fido.complaint(), is(equalTo("Grrrr")));
    }

    @Test
    public void a_cat_complains_by_meowing() {
        Cat felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("White");

        assertThat(felix.complaint(), is(equalTo("Meow")));
    }

    @Test
    public void cats_and_dogs_complain_to_the_assistant() {
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");
        Cat felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("White");

        ComplaintRegister complaintRegister = new ComplaintRegister();
        VetAssistant assistant = new VetAssistant(complaintRegister);

        assistant.recordComplainFrom(fido);
        assistant.recordComplainFrom(felix);
        assertThat(complaintRegister.getComplaints(), hasItems("Grrrr", "Meow"));
    }
}
