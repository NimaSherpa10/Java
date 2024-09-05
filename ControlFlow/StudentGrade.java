import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for 5 subjects
        System.out.print("Enter marks obtained in Maths: ");
        int maths = scanner.nextInt();

        System.out.print("Enter marks obtained in Physics: ");
        int physics = scanner.nextInt();

        System.out.print("Enter marks obtained in Chemistry: ");
        int chemistry = scanner.nextInt();

        System.out.print("Enter marks obtained in English: ");
        int english = scanner.nextInt();

        System.out.print("Enter marks obtained in Hindi: ");
        int hindi = scanner.nextInt();

        // Calculate total marks and percentage
        int totalMarks = maths + physics + chemistry + english + hindi;
        int maxMarks = 500; // Each subject is out of 100 marks
        double percentage = (totalMarks / (double)maxMarks) * 100;

        // Display the percentage
        System.out.println("Percentage: " + percentage + "%");

        // Calculate grade based on percentage
        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else if (percentage >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }

        scanner.close();
    }
}
