package Thread;

class Genaric {
	static ThreadLocal<Integer> local = new ThreadLocal<>();
}

public class ThreadLocalDemo {	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(() -> {
			Genaric.local.set(2);
			System.out.println(Thread.currentThread().getName() + " : " + Math.pow(10, Genaric.local.get()));
		});
		t1.setName("t1");
		
		Thread t2 = new Thread(() -> {
			Genaric.local.set(3);
			System.out.println(Thread.currentThread().getName() + " : " + Math.pow(10, Genaric.local.get()));
		});
		t2.setName("t2");
		
		t1.start();
		t2.start();
		
		Genaric.local.set(4);
		System.out.println(Thread.currentThread().getName() + " : " + Math.pow(10, Genaric.local.get()));
	}

}
