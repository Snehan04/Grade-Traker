import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTraker{

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList to store the grades
        ArrayList<Integer> grades = new ArrayList<>();
        
        // Variable to keep track of if user wants to continue entering grades
        String continueInput = "yes";
        
        // Loop to take grades input until the user decides to stop
        while (continueInput.equalsIgnoreCase("yes")) {
            System.out.print("Enter a student's grade: ");
            int grade = scanner.nextInt();
            grades.add(grade); // Store the grade in the list
            
            // Ask if the user wants to enter another grade
            System.out.print("Do you want to enter another grade? (yes/no): ");
            continueInput = scanner.next();
        }
        
        // Calculate the average, highest, and lowest scores
        double Ave = calculateAverage(grades);
        int High = calculateHighest(grades);
        int Low = calculateLowest(grades);
        
        // Display the results
        System.out.println("\nStudent Grade Report:");
        System.out.println("Average Grade: " + Ave);
        System.out.println("Highest Grade: " + High);
        System.out.println("Lowest Grade: " + Low);
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to calculate the average of the grades
    public static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
    
    // Method to find the highest grade
    public static int calculateHighest(ArrayList<Integer> grades) {
        int High = grades.get(0); // Assume the first grade is the highest
        for (int grade : grades) {
            if (grade > High) {
                High = grade; // Update if a higher grade is found
            }
        }
        return High;
    }
    
    // Method to find the lowest grade
    public static int calculateLowest(ArrayList<Integer> grades) {
        int Low = grades.get(0); // Assume the first grade is the lowest
        for (int grade : grades) {
            if (grade < Low) {
                Low = grade; // Update if a lower grade is found
            }
        }
        return Low;
    }
}
