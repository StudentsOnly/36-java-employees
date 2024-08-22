public class Manager extends Employee {
    private double baseSalary = 5000;
    private double bonus = baseSalary * 0.3;

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("\tSalary: $" + calculateSalary());
    }
}
