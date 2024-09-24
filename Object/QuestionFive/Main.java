package Object.QuestionFive;

public class Main {
    public static void main(String[] args) {
        // Testing Seasonal Pass with 10% discount
        SeasonalPass seasonalPass = new SeasonalPass("City A", "City B", 100.0);
        seasonalPass.PrintFare();

        // Testing One-Time Pass (No Discount)
        OneTimePass oneTimePass = new OneTimePass("City A", "City B", 100.0);
        oneTimePass.PrintFare();

        // Testing Free Pass (Freedom Fighters)
        FreePass freePass = new FreePass("City A", "City B");
        freePass.PrintFare();

        // Testing Student Seasonal Pass with 30% discount
        StudentSeasonalPass studentSeasonalPass = new StudentSeasonalPass("City A", "City B", 100.0);
        studentSeasonalPass.PrintFare();

        // Testing Child Pass with 50% discount
        ChildPass childPass = new ChildPass("City A", "City B", 100.0);
        childPass.PrintFare();

        // Testing Adult Pass (No Discount)
        AdultPass adultPass = new AdultPass("City A", "City B", 100.0);
        adultPass.PrintFare();

        // Testing Physically Handicapped Pass with 40% discount
        PhysicallyHandicappedPass handicappedPass = new PhysicallyHandicappedPass("City A", "City B", 100.0);
        handicappedPass.PrintFare();

        // Testing Seniors Pass with 60% discount
        SeniorsPass seniorsPass = new SeniorsPass("City A", "City B", 100.0);
        seniorsPass.PrintFare();
    }
}
