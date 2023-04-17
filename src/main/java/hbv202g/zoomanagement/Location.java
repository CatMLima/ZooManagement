package hbv202g.zoomanagement;

import java.util.*;
/*
Catarina Lima worked on this class.
 */
public abstract class Location {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    Stack<Employee> employees;

    Stack<Animal> animals;

    public void addEmployee(Employee employee){
        employees.push(employee);
    }
    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    Stack<Animal> sickAnimals;

}
