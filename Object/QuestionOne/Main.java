package Object.QuestionOne;

public class Main {
    public static void main(String[] args) {
        Student fastTrackStudent = new FastTrackBatchStudent(1, "John Doe", "1234567890", "NY", "Java");
        System.out.println("FastTrack Fee: " + fastTrackStudent.CalculateFee());

        Student corporateStudent = new CorporateBatchStudent(2, "Jane Smith", "0987654321", "LA", "Python");
        System.out.println("Corporate Fee: " + corporateStudent.CalculateFee());

        Student weekendStudent = new WeekendBatch(3, "Alice Bob", "1231231231", "SF", "C++");
        System.out.println("Weekend Fee: " + weekendStudent.CalculateFee());

        Student corpWeekendStudent = new CoroporateWeekendBatchStudent(4, "Charlie", "9876543210", "Chicago", "React");
        System.out.println("Corporate Weekend Fee: " + corpWeekendStudent.CalculateFee());
    }
}
