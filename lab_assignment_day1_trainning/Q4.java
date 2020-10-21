package lab_assignment_day1_trainning;

public class Q4 {

	public static void main(String[] args) 
    { 
        int a[] = {1, 8, 3}; 
        int b[] = new int[a.length]; 
        b = a;     
        b[0]++; 
  
        System.out.println("Sample Array is:"); 
        for (int i=0; i<a.length; i++) 
            System.out.print(a[i] + " "); 
        System.out.println("\nCopied Array is "); 
        for (int i=0; i<b.length; i++) 
            System.out.print(b[i] + " "); 
    } 
} 

