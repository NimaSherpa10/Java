import java.util.Scanner;

public class studentDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input total marks and marks obtained by the student
        System.out.print("Enter the total marks: ");
        int totalMarks = scanner.nextInt();

        System.out.print("Enter the marks obtained by the student: ");
        int obtainedMarks = scanner.nextInt();

        // Calculate percentage
        double percentage = ((double) obtainedMarks / totalMarks) * 100;

        // Check division based on percentage
        if (percentage >= 60) {
            System.out.println("Division 1");
        } else if (percentage >= 45) {
            System.out.println("Division 2");
        } else if (percentage >= 30) {
            System.out.println("Division 3");
        } else {
            System.out.println("Fail");
        }

        scanner.close();
    }
}
