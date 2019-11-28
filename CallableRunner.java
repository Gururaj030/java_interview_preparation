package Thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<Integer> {

	public Integer call() throws Exception {
		Thread.sleep(1000);
		return new Random().nextInt();
	}
}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(10);
		Future<Integer> future = service.submit(new CallableTask());

		System.out.println("executing main thread");
		int value = future.get();
		System.out.println("Future value : " + value);
	}

}
