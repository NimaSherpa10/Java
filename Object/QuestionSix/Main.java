package Object.QuestionSix;

public class Main {
    public static void main(String[] args) {
        Car honda = new Car("HONDACIVIC-- Car");
        System.err.println("This is " + honda.getRegNumber());
        System.out.println("the no of Wheels is ---> " + honda.getNumberOfWheels());

        Auto auto = new Auto("Auto");
        System.err.println("This is " + auto.getRegNumber());
        System.out.println("No. of wheels : >>>> " + auto.getNumberOfWheels());

        MotorBike truimph = new MotorBike("Bike");
        System.err.println("This is " + truimph.getRegNumber());
        System.out.println("No. of wheels : >>>> " + truimph.getNumberOfWheels());
    }
}
