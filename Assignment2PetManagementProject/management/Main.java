package Assignment2PetManagementProject.management;

import Assignment2PetManagementProject.model.Bird;
import Assignment2PetManagementProject.model.Cat;
import Assignment2PetManagementProject.model.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Spike");
        Cat cat = new Cat("tom");
        Bird bird = new Bird("Cuckoo");
        ManagePet managePet = new KamolManagePet();
        managePet.addPet(dog);
        managePet.addPet(cat);

        managePet.feedPet();
        managePet.exercisePet();
        managePet.showAllPet();
        managePet.removePet(cat);
        managePet.showAllPet();
        managePet.addPet(bird);
        managePet.showAllPet();
        managePet.feedPet();
        managePet.exercisePet();

    }
}
