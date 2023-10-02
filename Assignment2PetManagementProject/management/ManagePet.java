package Assignment2PetManagementProject.management;

import Assignment2PetManagementProject.model.Animal;

import java.util.List;

public interface ManagePet {
    List<Animal> GetPet();
    void addPet(Animal animal);
    void removePet(Animal animal);
    void showAllPet();
    void feedPet();
    void exercisePet();
}
