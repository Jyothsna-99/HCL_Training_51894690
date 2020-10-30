package lab_assignment_day4_training.q2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {
	
	public static void main(String[] args) throws IOException  {
		BufferedReader bufre = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		s = bufre.readLine();
		BufferedWriter bufwr = new BufferedWriter(new FileWriter("example2.txt"));
		bufwr.write(sentence);
		System.out.println("data was written");
		bufwr.close();
		bufre.close();
	}
}
