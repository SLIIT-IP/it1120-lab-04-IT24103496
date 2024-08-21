import java.util.Scanner;

public class IT24103496LAB4Q2B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Error: Exam marks should be between 0 and 100.");
            return;
        }

        System.out.print("Enter lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Error: Lab marks should be between 0 and 100.");
            return;
        }

        System.out.print("Enter percentage taken from exam marks: ");
        double examPercentage = scanner.nextDouble();
        if (examPercentage < 0 || examPercentage > 100) {
            System.out.println("Error: Exam percentage should be between 0 and 100.");
            return;
        }
        System.out.print("Enter percentage taken from lab marks: ");
        double labPercentage = scanner.nextDouble();
        if (labPercentage < 0 || labPercentage > 100) {
            System.out.println("Error: Lab percentage should be between 0 and 100.");
            return;
        }

        if (examPercentage + labPercentage != 100) {
            System.out.println("Error: The percentages do not add up to 100.");
            return;
        }

        double finalMark = (examMarks * (examPercentage / 100)) + (labMarks * (labPercentage / 100));

        System.out.println("The final mark for the module is: " + finalMark);
    }
}
