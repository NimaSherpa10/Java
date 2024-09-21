package Object.QuestionOne;

public class FastTrackBatchStudent extends Student {
    public FastTrackBatchStudent(int id, String name, String phone, String address, String major) {
        super(id, name, phone, address, major);
    }

    public double CalculateFee() {
        return 1500.0;
    }

   
}
