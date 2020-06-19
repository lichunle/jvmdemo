package automic;

import java.util.concurrent.atomic.AtomicInteger;

public class AutomicDemo {

	public static void main(String[] args) {
		
		AtomicInteger first = new AtomicInteger();
		System.out.println(first.incrementAndGet());
		System.out.println(first.incrementAndGet());
		System.out.println(first.incrementAndGet());
	}
}
