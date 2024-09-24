package Object.QuestionFive;

public class AdultPass extends GeneralPass {
    public AdultPass(String origin, String destination, double fare) {
        super(origin, destination, fare);
    }

    @Override
    public double getFare() {
        return super.getFare();  // No discount for adults
    }

    @Override
    public void PrintFare() {
        System.out.println("Adult pass fare from " + getOrigin() + " to " + getDestination() + " is: $" + getFare());
    }
}
