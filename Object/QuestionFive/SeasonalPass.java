package Object.QuestionFive;

public class SeasonalPass extends Fare {
    private double discount = 10.0;
    public SeasonalPass(String origin, String Destination, double fare) {
        super(origin, Destination, fare);
       
    }

    public double getDiscountRate() {
        return discount;
    }

    public double getFare() {
        double discountAmount = (discount / 100) * super.getFare();
        return super.getFare() - discountAmount;  // 40% of the fare
    }

 
    public void PrintFare() {
        System.out.println("Seasonal fare from " + getOrigin() + " to " + getDestination() + " after 10% discount is: $" + getFare());
    }
}
