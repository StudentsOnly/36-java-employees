public class Employee {

    protected String name;
    protected int employeeID;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void calculateSalary() {
        System.out.println("Calculate salary of Employee.");
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name + ", ID: " + employeeID);
        calculateSalary();
    }

}
