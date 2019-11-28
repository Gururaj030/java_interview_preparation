package Thread;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyApp {
	int count = 0;
	Lock lock = new ReentrantLock();
	Condition condition = lock.newCondition();
	
	public synchronized void increment() {
		for(int i = 1; i <= 10000; i++) {
			count += 1;
		}
	}
	
	public void incrementByFirst() throws InterruptedException {
		lock.lock();
		System.out.println(Thread.currentThread().getName() + "i'm running and i will start waiting");
		condition.await();
		System.out.println(Thread.currentThread().getName() + "i'm back");
		
		try {
			increment();
		} finally {
			lock.unlock();
		}
	}
	
	public void incrementBySecond() {
		lock.lock();
		
		System.out.println(Thread.currentThread().getName() + "i'm waiting for signal");
		new Scanner(System.in).nextLine();
		condition.signal();
		System.out.println(Thread.currentThread().getName() + "i'm back");
		
		System.out.println("{WECWCVEWCVECVE");
		try {
			increment();
		} finally {
			lock.unlock();
		}
	}
}

public class LockThreadDemo {

	public static void main(String[] args) {
		MyApp app = new MyApp();
		
		Thread t1 = new Thread(() -> {
			try {
				app.incrementByFirst();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		t1.setName("T1 : ");
		
		Thread t2 = new Thread(() -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			app.incrementBySecond();
		});
		t2.setName("T2 : ");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.out.println(app.count);
		
		
	}

}
