package practice;

public class Employee {
    private int id;
    private String name;
    private Address address;

    public Employee(int id, String name, Address address) {
        this.id  = id;
        this.name = name;
        this.address = address;
    }

    void Display() {
        System.out.println(id + "   " + name);
        System.out.println(address.city + "\t" + address.state);
    }

    public static void main(String[] args) {
        Address a = new Address("Ktm", "Bagmati", "Nepal");
        Address a1 = new Address("Ktm2", "Bagmati2", "Nepal");

        Employee e = new Employee(0, "Shiva", a);
        Employee e1 = new Employee(0, "Rani", a1);

        e.Display();
        e1.Display();
    }

}
