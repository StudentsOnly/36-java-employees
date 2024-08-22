public class Manager extends Employee {

    private double baseSalary;
    private double bonus;

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Employee earns $" + (baseSalary + bonus));
    }
}
