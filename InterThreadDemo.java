package Thread;

class Common1 {
	int num;
	boolean valueSet;
	
	public synchronized void put(int num) {
		System.out.println(Thread.currentThread().getName() + " : PUT : " + num);
		if(valueSet) {
			try { wait(); } catch(Exception e) {}
		}
		this.num = num;
		valueSet = true;
		notify();
	}
	
	public synchronized void get() {
		if(!valueSet) {
			try { wait(); } catch(Exception e) {}
		}
		System.out.println(Thread.currentThread().getName() + " : GET : " + num);
		valueSet = false;
		notify();
	}
}

class Producer implements Runnable {
	
	Common1 common;
	
	public Producer(Common1 common) {
		this.common = common;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	public void run() {
		int i=0;
		while(true) {
			common.put(i++);
			try { Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}

class Consumer implements Runnable {
	
	Common1 common;
	
	public Consumer(Common1 common) {
		this.common = common;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	public void run() {
		while(true) {
			common.get();
			try { Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}

public class InterThreadDemo {

	public static void main(String[] args) {
		Common1 common = new Common1();
		new Producer(common);
		new Consumer(common);
	}

}
