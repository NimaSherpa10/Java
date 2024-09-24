package Object.QuestionFive;

public class FreePass extends Fare{
    private double FreedomFighterFare = 0;
    public FreePass(String origin,String Destination) {
        super(origin, Destination, 0.0);
    }

    public double getFare() {
        return FreedomFighterFare;
    }
    
}
