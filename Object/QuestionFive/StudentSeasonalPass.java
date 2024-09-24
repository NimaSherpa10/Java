package Object.QuestionFive;

public class StudentSeasonalPass extends SeasonalPass{
    private double studentDiscount = 30.0;
    public StudentSeasonalPass(String origin, String Destination, double fare) {
        super(origin, Destination, fare);
    }
    public double getFare() {
        double discountAmount = (studentDiscount / 100) * super.getFare();
        return super.getFare() - discountAmount;  
    }
    
        @Override
        public void PrintFare() {
            System.out.println("Student seasonal fare from " + getOrigin() + " to " + getDestination() + " after 30% discount is: $" + getFare());
    }
}   
