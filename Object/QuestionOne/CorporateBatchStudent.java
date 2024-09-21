package Object.QuestionOne;

public class CorporateBatchStudent extends Student {
    public CorporateBatchStudent(int id, String name, String phone, String address, String major) {
        super(id, name, phone, address, major);
    }

    public double CalculateFee() {
        return 2000.0;
    }
}
