package Assignment2PetManagementProject.model;

public class Bird implements Animal {
    String name;
    String species;
    String eat;
    String sleep;
    String play;
    String speak;

    public Bird(String name) {
        this.name = name;
        species = "Bird";
        eat = "Fish";
        sleep = "Sleeping";
        play = "Playing";
        speak = "Chirp";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String eat() {
        return eat;
    }

    @Override
    public String sleep() {
        return sleep;
    }

    @Override
    public String play() {
        return play;
    }

    @Override
    public String speak() {
        return speak;
    }

    @Override
    public String walk() {
        return "walking";
    }

    @Override
    public String swim() {
        return "swimming";
    }

    @Override
    public String fly() {
        return "flying";
    }

    @Override

    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", eat='" + eat + '\'' +
                ", sleep='" + sleep + '\'' +
                ", play='" + play + '\'' +
                ", speak='" + speak + '\'' +
                '}';
    }

}
