public class Developer extends Employee {

    private double hourlyRate;
    private int hoursWorked;

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Employee earns $" + (hourlyRate * hoursWorked));
    }

}
