package lab_assignment_day1_trainning;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 9;	
		System.out.format("      ");
		for (int i=1;i<=size;i++)
		{
			System.out.format("%4d", i);
		}
		System.out.println();
		System.out.println("------------------------------------------");
		for (int i=1;i<=size;i++)
		{
			System.out.format("%4d |", i);
			for (int j=1;j<=size;j++) 
			{
				System.out.format("%4d", i * j);
			}
			System.out.println();
		}
	}

}
