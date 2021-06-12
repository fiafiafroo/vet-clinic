package serenitylabs.tutorials.vetclinic.model;

import serenitylabs.tutorials.vetclinic.Breed;
import serenitylabs.tutorials.vetclinic.Pet;
import serenitylabs.tutorials.vetclinic.collections.katas.PetFood;

public class FoodDispenser {
    public void feed(Pet pet) {
        if (pet.getBreed() == Breed.Cat) {
            feedCat(pet);
        } else if (pet.getBreed() == Breed.Dog) {
            feedDog(pet);
        }
    }

    private void feedDog(Pet pet) {
        pet.feed(20 * pet.getWeightInKilos(), PetFood.FidosFood);
    }

    private void feedCat(Pet pet) {
        pet.feed(10 * pet.getWeightInKilos(), PetFood.KittyKat);
    }
}
