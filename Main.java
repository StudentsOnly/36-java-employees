public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("John");
        manager.setEmployeeID(1);
        manager.displayInfo();

        Developer dev = new Developer();
        dev.setName("Bob");
        dev.setEmployeeID(2);
        dev.displayInfo();

    }

}