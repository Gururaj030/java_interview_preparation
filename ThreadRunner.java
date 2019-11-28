/**
 * One way of implementing thread using Thread Class
 */
class MyThread extends Thread {
	/**
	 * Run method will contain the logic thread should perform
	 */
	@Override
	public void run() {
		System.out.println("Running MyThread : " + Thread.currentThread().getName());
	}
}

/**
 * One way of implementing thread using Runnable interface
 */
class RunnableThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Running RunnableThread : " + Thread.currentThread().getName());
	}
	
}

/**
 * One way of implementing thread using both Thread and Runnable interface
 */
class CustomThread extends Thread implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Running CustomThread : " + Thread.currentThread().getName());
	}
}

public class ThreadRunner {

	public static void main(String[] args) {
		// Using Thread class
		Thread t1 = new MyThread();
		t1.start(); // start will internally invoke run method
		
		// Using Runnable interface
		RunnableThread runnableThread = new RunnableThread();
		Thread t2 = new Thread(runnableThread);
		t2.start();
		
		// Using both Thread class and Runnable interface
		CustomThread t3 = new CustomThread();
		t3.start();
	}

}
