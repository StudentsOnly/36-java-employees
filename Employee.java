public abstract class Employee {
    private String name;
    private int employeeID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double calculateSalary() {
        return -1;
    }

    public void displayInfo() {
        System.out.println("Position: " + this.getClass().getName());
        System.out.println("\tName: " + this.getName());
        System.out.println("\tID: " + this.getEmployeeID());
    }
}
