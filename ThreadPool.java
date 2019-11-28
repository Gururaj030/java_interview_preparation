package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{

	public void run() {
		System.out.println("Thread Name : " + Thread.currentThread().getName());
	}
	
}

public class ThreadPool {

	public static void main(String[] args) {
		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println(coreCount);
		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		
		for (int i = 0; i< 100; i++) {
			service.execute(new Task());
		}
	}
}
