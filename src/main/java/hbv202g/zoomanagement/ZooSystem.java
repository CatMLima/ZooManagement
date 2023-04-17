package hbv202g.zoomanagement;

import javafx.fxml.*;

import java.net.*;
import java.util.*;

public class ZooSystem implements Initializable {
    List<Employee> employeeList;

    List<Animal> animalList;
    Location lionKingdom;

    Location elephantElevation;

    Location penguinsPark;

    Location farmFriends;

    Location office;

    Location foodStandLion;

    Location foodStandElephant;

    Location foodStandPenguins;

    Location foodStandFarm;

    static Location hospital;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setLocations();
        createEmployees();
        assignEmployees();
        createAnimals();
        assignAnimals();

    }

    public void setLocations(){
        lionKingdom.setName("Lion Kingdom");
        elephantElevation.setName("Elephant Elevation");
        penguinsPark.setName("Penguins Park");
        farmFriends.setName("Farm Friends");
        foodStandLion.setName("Lion Feast");
        foodStandElephant.setName("Hungry Trunk");
        foodStandPenguins.setName("Fishy Fish");
        foodStandFarm.setName("Grains For Friends");
        office.setName("Main Office");
        hospital.setName("Hospital");
    }

    public void createEmployees(){
        employeeList.add(new Employee(101,"John", 28, lionKingdom, "active", "Feeder"));
        employeeList.add(new Employee(102,"Marie", 19, lionKingdom, "active", "Cleaner"));
        employeeList.add(new Employee(103,"Jennifer", 25, elephantElevation, "active", "Feeder"));
        employeeList.add(new Employee(104,"Thomas", 23, elephantElevation, "active", "Cleaner"));
        employeeList.add(new Employee(105,"Blake", 21, penguinsPark, "active", "Feeder"));
        employeeList.add(new Employee(106,"Travis", 28, penguinsPark, "active", "Cleaner"));
        employeeList.add(new Employee(107,"Jessica", 31, farmFriends, "active", "Feeder"));
        employeeList.add(new Employee(108,"Marcus", 22, farmFriends, "active", "Cleaner"));
        employeeList.add(new Employee(111,"Tatiana", 35, office, "active", "Manager"));
        employeeList.add(new Employee(112,"Jake", 28, office, "active", "Assistant Manager"));
        employeeList.add(new Employee(113,"Mali", 20, foodStandLion, "active", "Food Crew"));
        employeeList.add(new Employee(114,"Tan", 16, foodStandElephant, "active", "Food Crew"));
        employeeList.add(new Employee(115,"Lara", 18, foodStandFarm, "active", "Food Crew"));
        employeeList.add(new Employee(116,"Jerry", 19, foodStandPenguins, "active", "Food Crew"));
        employeeList.add(new Employee(117, "Tara", 40, hospital, "active", "Head Veterinarian"));
        employeeList.add(new Employee(118, "Jacob", 36, hospital, "vacation", "Veterinarian"));
    }
    public void assignEmployees(){
        List<Employee> employees = employeeList;
        for (Employee em : employees){
            switch (em.getLocation().getName()) {
                case "Lion Kingdom" -> lionKingdom.employees.push(em);
                case "Elephant Elevation" -> elephantElevation.employees.push(em);
                case "Penguins Park" -> penguinsPark.employees.push(em);
                case "Farm Friends" -> farmFriends.employees.push(em);
                case "Main Office" -> office.employees.push(em);
                case "Lion Feast" -> foodStandLion.employees.push(em);
                case "Hungry Trunk" -> foodStandElephant.employees.push(em);
                case "Grains For Friends" -> foodStandFarm.employees.push(em);
                case "Fishy Fish" -> foodStandPenguins.employees.push(em);
                case "Hospital" -> hospital.employees.push(em);
            }
        }
    }

    public void createAnimals(){
        animalList.add(new Animal(201,"Lilo", 10, lionKingdom, "lion", "male", 200));
        animalList.add(new Animal(202,"Elio", 10, elephantElevation, "elephant", "male", 5000));
        animalList.add(new Animal(203,"Paul", 10, penguinsPark, "penguin", "male", 16));
        animalList.add(new Animal(204,"Frederik", 10, farmFriends, "chicken", "male", 5));
        animalList.add(new Animal(205,"Greg", 10, farmFriends, "goat", "male", 15));
    }

    public void assignAnimals(){
        List<Animal> animals = animalList;
        for (Animal an : animals){
            switch (an.getLocation().getName()){
                case "Lion Kingdom" -> lionKingdom.animals.push(an);
                case "Elephant Elevation" -> elephantElevation.animals.push(an);
                case "Penguins Park" -> penguinsPark.animals.push(an);
                case "Farm Friends" -> farmFriends.animals.push(an);
            }
        }
    }
    public static void main (String[] args){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(118, "Jacob", 36, hospital , "vacation", "Veterinarian"));
        Employee rando = list.remove(0);
        System.out.println(rando.getName());
    }
}
