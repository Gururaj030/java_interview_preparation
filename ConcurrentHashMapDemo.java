package Thread;

import java.util.Hashtable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CommonClass {
	public static Hashtable <String, Integer> hashtable = new Hashtable<>();
	
	public static void name() {
		hashtable.get("2w2e2e");
	}
}

class MyThread extends Thread {
	public void run() {
		System.out.println("entering thread : " + this.currentThread().getName());
		CommonClass.name();
		System.out.println(CommonClass.hashtable);
		System.out.println("Exiting thread : " + this.currentThread().getName());
	}
}

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		Thread t3 = new MyThread();
//		t1.start();
//		t2.start();
//		t3.start();
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		executorService.submit(t1);
		executorService.submit(t2);
		executorService.submit(t3);
	}

}
