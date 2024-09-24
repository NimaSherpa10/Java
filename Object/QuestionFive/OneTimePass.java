package Object.QuestionFive;

public class OneTimePass extends Fare {
    public OneTimePass(String origin, String destination, double fare) {
        super(origin, destination, fare);
    }

    @Override
    public double getFare() {
        return super.getFare(); // No discount
    }

    @Override
    public void PrintFare() {
        System.out.println("One-time fare from " + getOrigin() + " to " + getDestination() + " is: $" + getFare());
    }
}
