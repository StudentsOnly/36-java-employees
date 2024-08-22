public class Developer extends Employee {
    private double hourlyRate = 15;
    int hoursWorked = 40 * 4;

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("\tSalary: $" + calculateSalary());
    }
}
