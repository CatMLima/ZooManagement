package hbv202g.zoomanagement;

public class Employee extends ZooPopulation{
    public String getWorkstatus() {
        return workstatus;
    }

    public void setWorkstatus(String workstatus) {
        this.workstatus = workstatus;
    }

    private String workstatus;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

    public Employee(int id, String name, int age, Location location, String workstatus, String Title){
        setId(id);
        setName(name);
        setAge(age);
        setLocation(location);
        setWorkstatus(workstatus);
        setTitle(title);
    }
    public void updateWorkStatus(String newStatus){
        setWorkstatus(newStatus);
    }
    public void updateTitle(String newTitle){
        setTitle(newTitle);
    }
}
