package lab_assignment_day1_trainning;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int noOfStudents = scanner.nextInt();
        int averageGrade = 0;
        for (int i=1;i<=noOfStudents;i++) {            
            System.out.print("Enter the grade for student"+" "+i);
            int grade = scanner.nextInt();
            averageGrade += grade;
            if (grade<0||grade>100) {
                System.out.println("Invalid grade, try again...");
                break;
            }
        }
        double average = averageGrade/noOfStudents;
        System.out.println("The average is " + average);
	}
	
}
