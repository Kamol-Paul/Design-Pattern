package Assignment2PetManagementProject.model;

public interface Animal {
    String getName();

    void setName(String name);
    String getSpecies();
    void setSpecies(String species);

    String eat();

    String sleep();

    String play();

    String speak();

    String walk();

    String swim();

    String fly();

    String toString();


}
