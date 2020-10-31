package lab_assignment_day5_training.q2;
import java.util.Random;
class RandomSum implements Runnable {
	
	private int sum;
	
	public RandomSum(int sum) 
        {
		this.sum = sum;
	}
	public int getSum()
        {
		return sum;
	}
	@Override
	public void run() 
        {
		getSum(sum);
	}
	public int getSum(int sum) 
        {

		Random r = new Random();
		int val = r.nextInt(10)+1;
		System.out.println("random number: " + val);
		synchronized (this) 
                {
			this.sum += val;
		}
		return this.sum;
	}
	
	
}
public class Tester2 {
	
	public static void main(String[] args) {
		
		int baseSum = 0;
		RandomSum randomSum = new RandomSum(baseSum);
		Thread thread1 = new Thread(randomSum);
		Thread thread2 = new Thread(randomSum);
		Thread thread3 = new Thread(randomSum);
		Thread thread4 = new Thread(randomSum);
		Thread thread5 = new Thread(randomSum);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Final sum: " + randomSum.getSum());

		System.out.println("main ends....!");
	}

}