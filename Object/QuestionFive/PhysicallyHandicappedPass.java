package Object.QuestionFive;

public class PhysicallyHandicappedPass extends GeneralPass {
    private double discount = 40.0; // 40% discount for physically handicapped

    public PhysicallyHandicappedPass(String origin, String destination, double fare) {
        super(origin, destination, fare);
    }

    @Override
    public double getFare() {
        double discountAmount = (discount / 100) * super.getFare();
        return super.getFare() - discountAmount;  // 40% of the fare
    }

    @Override
    public void PrintFare() {
        System.out.println("Physically handicapped pass fare from " + getOrigin() + " to " + getDestination() + " after 40% discount is: $" + getFare());
    }
}
