package Object.QuestionOne;

public class CoroporateWeekendBatchStudent extends Student {
    public CoroporateWeekendBatchStudent(int id, String name, String phone, String address, String major) {
        super(id, name, phone, address, major);
    }

    public double CalculateFee() {
        return 3000.0;
    }
}
