package Thread;

public class DeamonThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "Started");
		Thread t1 = new Thread(() -> {
			for(int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + "\t : " + i);

				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.setName("t1");
		t1.setDaemon(true);
		t1.start();
		
		Thread t2 = new Thread(() -> {
			for(int i = 11; i <= 20; i++) {
				System.out.println(Thread.currentThread().getName() + "\t : " + i);

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t2.setName("t2");
		t2.start();
		
		System.out.println(Thread.currentThread().getName() + "ended");
	}

}
