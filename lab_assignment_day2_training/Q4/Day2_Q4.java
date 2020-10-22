package lab_assignment_day2_training;

import java.util.Scanner;

public class Day2_Q4 {
	
	private static Scanner sc = new Scanner(System.in);
	private static Student student;
	
	public static void main(String[] args) {

		System.out.println("enter name");
		String isName = sc.next();

		System.out.println("enter id");
		String isId = sc.next();

		System.out.println("enter grade");
		String isgrade = sc.next();

		
		if (isName.equalsIgnoreCase("yes") && isId.equalsIgnoreCase("yes") && isgrade.equalsIgnoreCase("yes")) {

			System.out.println("Enter name, id and grade values");
			String name = sc.next();
			String id = sc.next();
			double grade = sc.nextDouble();

			student = new Student(name, id, grade);
			displayDetails();
			
			
		} else if (isName.equalsIgnoreCase("yes") && isId.equalsIgnoreCase("yes") && !isgrade.equalsIgnoreCase("yes")) {

			System.out.println("Enter name, id values");
			String name = sc.next();
			String id = sc.next();

			student = new Student(name, id);
			displayDetails();
			
		} else if (!isName.equalsIgnoreCase("yes") && isId.equalsIgnoreCase("yes") && !isgrade.equalsIgnoreCase("yes")) {
			System.out.println("Enter id value");
			String id = sc.next();

			student = new Student(id);
			displayDetails();
		} else {
			System.out.println("select name or id");
		}
	}
	
	public static void displayDetails() {
		System.out.println("want to enter year Y/N");
		String isYear = sc.next();
		if (isYear.equalsIgnoreCase("yes")) {
			System.out.println("Enter year");
			int year = sc.nextInt();
			student.display(year);
		} else {
			student.display();
		}
	}
}
