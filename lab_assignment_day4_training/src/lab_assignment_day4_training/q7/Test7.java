package lab_assignment_day4_training.q7;
import java.io.IOException;
import lab_assignment_4.q6.InputException;

public class Test7 {

	public static void main(String[] args) {
		ExceptionExample exc = new ExceptionExample();
		try {
			exc.throwException();
		} catch (InputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}