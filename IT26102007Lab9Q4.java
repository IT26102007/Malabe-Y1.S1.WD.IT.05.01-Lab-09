import java.util.Scanner;

public class IT26102007Lab9Q4 {

    
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    
    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-10s | %-10.2f | %-5c\n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];
        double[] assignmentMarks = new double[5];
        double[] examMarks = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = scanner.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            assignmentMarks[i] = scanner.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            examMarks[i] = scanner.nextDouble();
        }

        System.out.println("\nName       | Final Mark | Grade");
        System.out.println("--------------------------------");

        for (int i = 0; i < 5; i++) {
            double finalMark = calcFinalMark(assignmentMarks[i], examMarks[i]);
            char grade = findGrades(finalMark);
            printDetails(names[i], finalMark, grade);
        }

        scanner.close();
    }
}