package Assignment2PetManagementProject.model;

public class Cat implements Animal
{
    String name;
    String species;
    String eat;
    String sleep;
    String play;
    String speak;
    public Cat(String name){
        this.name = name;
        species = "Cat";
        eat = "Fish";
        sleep = "Sleeping";
        play = "Playing";
        speak = "Meow";
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
        return "";
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", eat='" + eat + '\'' +
                ", sleep='" + sleep + '\'' +
                ", play='" + play + '\'' +
                ", speak='" + speak + '\'' +
                '}';
    }


}
