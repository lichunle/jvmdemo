package volatiledemo;

import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomicDemo {

	public static void main(String[] args) {
		AtomicDemo ad = new AtomicDemo();
		for (int i = 0; i < 10; i++) {
			new Thread(ad).start();
		}
		
	}
}
class AtomicDemo implements Runnable {

	private volatile int sno = 0;
//	private AtomicInteger sno = new AtomicInteger();
	
	@Override
	public void run() {

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
		}
		
		System.out.println(getSno());
	}
	
	public int getSno() {
		return sno++;
	}
	
}
