package lab_assignment_day4_training.q3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test3 {
	public static void main(String[] args) {
		try {
			ObjectOutputStream o1 = new ObjectOutputStream(new FileOutputStream("test3.ser"));
			Employee e1 = new Employee("jyosh", 123, "sklm", 300);
			o1.writeObject(e1);
			e1.display();
			System.out.println("serialized");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("test3.ser"));
			Employee e2 = (Employee) o2.readObject();
			e2.display();
			System.out.println("deserialized");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
