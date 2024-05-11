package chapter9.someclasses;

public class Employee extends Person{

    // employee is a person and have "age" and "name"
    // but as they are defined in the Person Class
    // we can 'extend' from it and focus in the extra part.
    private String employeeId;
    private String function;


    public Employee(){
        super("angie");
        //
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
