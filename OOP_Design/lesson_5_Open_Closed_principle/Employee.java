abstract public class Employee {
    private int id;
    private String name;
    private String Department;
    private boolean working;


    public Employee(int id, String name, String department, boolean working) {
        super();
        this.id = id;
        this.name = name;
        this.Department = department;
        this.working = working;
    }
public abstract void performDuties();
    @Override
    public String toString() {
        return "Employee_id= " + id + ", name= " + name + ", Department= " + Department + ", Woeking= " + working;
    }
}
