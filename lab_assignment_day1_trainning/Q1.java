package lab_assignment_day1_trainning;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n = 20, f1 = 1, f2 = 1, fib, sum = 2;
	System.out.print(f1+" "+f2+" ");
	for (int i = 1; i <= 18; i++) {
		fib = f1 + f2;
		f1 = f2;
		f2 = fib;
		sum += fib;
		System.out.print(fib+" ");
	}
	System.out.println();
	System.out.print("The average of Fib series  " + (float)sum / n);
}
}
