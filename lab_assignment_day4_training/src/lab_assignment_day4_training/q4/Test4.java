package lab_assignment_day4_training.q4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n = 0;
		try {

			do {
				System.out.println("enter -1 to quit");
				num = s.nextInt();
				evenOddNumCheck(n);
			} while (n!= -1);
			
			
		} catch (InputMismatchException e) {
			System.out.println("enter an integer");
		}
		
	}

	private static void evenOddNumCheck(int n) {
		if (n%2==0) {
			System.out.println("even number");
		} else if(n%2!=0){
			System.out.println("odd number");
		} else {
			System.exit(0);
		}
	}
}
