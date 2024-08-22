public class Main{

    public static void main(String[] args) {

        Manager manager = new Manager();
        Developer developer = new Developer();

        manager.setName("Ralf");
        manager.setEmployeeID(1234);
        manager.setBaseSalary(5000.0);
        manager.setBonus(400);
        manager.displayInfo();
        System.out.println();

        developer.setName("Alfred");
        developer.setEmployeeID(4321);
        developer.setHourlyRate(26.0);
        developer.setHoursWorked(4 * 40);
        developer.displayInfo();

    }

}
