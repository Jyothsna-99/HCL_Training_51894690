package lab_assignment_day4_training.q5;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
                Scanner s= new Scanner(System.in);
		try(s) {
			System.out.println("enter a number");
			int n=s.nextInt();
			try {
				if(n>100) {
					throw new Exception();
				}
			}catch (Exception e) {
				System.out.println("Num not greater than 100");
			}
		}
	}
}
