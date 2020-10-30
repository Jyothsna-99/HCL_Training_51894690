package lab_assignment_day4_training.q6;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
                Scanner s=new Scanner(System.in);
		try(s) {
			System.out.println("enter a number");
			int n=sc.nextInt();
			try {
				if(nu>100) {
					throw new InputException("number not greater than 100");
				}
			} catch (InputException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
