package Assignment2PetManagementProject.management;

import Assignment2PetManagementProject.model.Animal;

import java.util.ArrayList;
import java.util.List;

public class KamolManagePet implements ManagePet{
    public List<Animal> animalList;
    public KamolManagePet(){
        animalList = new ArrayList<>();
    }
    @Override
    public List<Animal> GetPet() {
        return animalList;
    }

    @Override
    public void addPet(Animal animal) {
        animalList.add(animal);
        System.out.println(animal.getName() + " is added in manage list.");
    }

    @Override
    public void removePet(Animal animal) {
        animalList.remove(animal);
        System.out.println(animal.getName() + " is removed in manage list.");
    }

    @Override
    public void showAllPet() {
        System.out.println("You have these pets: ");
        for (Animal animal : animalList) {
            System.out.println(animal.toString());
        }
    }

    @Override
    public void feedPet() {
        System.out.println("You fed all the pets");
        for (Animal animal : animalList) {
            System.out.println(animal.getName() + " " + "eating" + " " +animal.eat() );
        }
    }

    @Override
    public void exercisePet() {
        System.out.println("Animal are start exercise");
        for (Animal animal : animalList) {
            System.out.println(animal.getName() + " " + "exercise" + " " +animal.play() + " " + animal.walk() + " " + animal.swim() + " " + animal.fly());
        }
    }
}
