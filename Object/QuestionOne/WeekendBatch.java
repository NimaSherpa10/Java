package Object.QuestionOne;

public class WeekendBatch extends Student {
    public WeekendBatch(int id, String name, String phone, String address, String major) {
        super(id, name, phone, address, major);
    }

    public double CalculateFee() {
        return 2500.0;
    }
}
