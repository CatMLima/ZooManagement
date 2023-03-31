package hbv202g.zoomanagement;

public class Animal extends ZooPopulation{

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    private String species;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String gender;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int weight;


    public Animal(int id, String name, int age, Location location, String species, String gender, int weight){
        setId(id);
        setName(name);
        setAge(age);
        setLocation(location);
        setSpecies(species);
        setGender(gender);
        setWeight(weight);
    }

    public void updateWeight(int newWeight){
        setWeight(newWeight);
    }
    public void updateAge(){
        setAge(age + 1);
    }

}
