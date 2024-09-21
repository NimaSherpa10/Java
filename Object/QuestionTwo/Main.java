package Object.QuestionTwo;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee(1, 4000.0, 1000, 500, "John", "Doe", "123 Main St", "12345");
        System.out.println("Full-Time Employee:");
        System.out.println("Name: " + fullTimeEmp.realName());
        System.out.println("Salary: " + fullTimeEmp.CalcSalary());

        PartTimeEmployee partTimeEmp = new PartTimeEmployee(2, 2000, 300, 100, "Jane", "Doe", "789 Elm St", "67890");
        System.out.println("\nPart-Time Employee:");
        System.out.println("Name: " + partTimeEmp.realName());
        System.out.println("Salary: " + partTimeEmp.CalcSalary());

        NightShiftEmployee nightShiftEmp = new NightShiftEmployee(3, 3000, 500, 200, "Alice", "Smith", "456 Elm St", "54321", 100);
        System.out.println("\nNight Shift Employee:");
        System.out.println("Name: " + nightShiftEmp.realName());
        System.out.println("Salary: " + nightShiftEmp.CalcSalary());

        Manager manager = new Manager(4, 5000, 800, 400, "Bob", "Johnson", "321 Oak St", "13579", 150);
        System.out.println("\nManager:");
        System.out.println("Name: " + manager.realName());
        System.out.println("Salary: " + manager.CalcSalary());
    }
}
