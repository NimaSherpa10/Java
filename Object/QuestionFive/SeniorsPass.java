package Object.QuestionFive;

public class SeniorsPass extends GeneralPass {
    private double discount = 60.0; // 60% discount for seniors

    public SeniorsPass(String origin, String destination, double fare) {
        super(origin, destination, fare);
    }

    @Override
    public double getFare() {
        double discountAmount = (discount / 100) * super.getFare();
        double newFare = super.getFare() - discountAmount;
        return newFare;  // 60% of the fare
    }

    @Override
    public void PrintFare() {
        System.out.println("Senior pass fare from " + getOrigin() + " to " + getDestination() + " after 60% discount is: $" + getFare());
    }
}
