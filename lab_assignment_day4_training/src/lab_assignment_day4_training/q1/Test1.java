package lab_assignment_day4_training.q1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) {
		FileInputStream f = null;
		try {
		      f = new FileInputStream("example.txt");
		      int line = 0;
		      while((line = f.read()) != -1) 
		      {
		       System.out.print((char)line);
		       }
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			
			e.printStackTrace();
		}
		try {
			f.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
