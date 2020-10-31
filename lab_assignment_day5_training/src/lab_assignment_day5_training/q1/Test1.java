package lab_assignment_day5_training.q1;
class MultiThreaded implements Runnable{
	@Override
	public void run() {	
		for(int i=0;i<=100;i++) {
			System.out.println("Thread name: " + Thread.currentThread().getName() + " " + i);
		}
	}	
}
public class Test1 {
	public static void main(String[] args) {		
		MultiThreaded multiThread = new MultiThreaded();
		Thread t1 = new Thread(multiThread, "Thread1");
		Thread t2 = new Thread(multiThread, "Thread2");
		Thread t3 = new Thread(multiThread, "Thread3");
                Thread t4 = new Thread(multiThread, "Thread4");				
		t1.start();
		t2.start();
		t3.start();
                t4.start();
		
	}

}
