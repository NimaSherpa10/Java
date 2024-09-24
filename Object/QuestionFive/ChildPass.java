package Object.QuestionFive;

public class ChildPass extends GeneralPass {
    private double discount = 50.0; // 50% discount for children

    public ChildPass(String origin, String destination, double fare) {
        super(origin, destination, fare);
    }

    @Override
    public double getFare() {
        double discountAmount = (discount / 100) * super.getFare();
        return super.getFare() - discountAmount;  // 50% of the fare
    }

    @Override
    public void PrintFare() {
        System.out.println("Child pass fare from " + getOrigin() + " to " + getDestination() + " after 50% discount is: $" + getFare());
    }
}
