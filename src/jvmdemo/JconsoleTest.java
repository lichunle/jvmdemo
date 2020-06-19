package jvmdemo;

import java.util.ArrayList;
import java.util.List;

public class JconsoleTest {

	
	public JconsoleTest() {
		byte[] b1 = new byte[128*1024];
	}
	
	public static void main(String[] args) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("start......");
		file(1000);
	}
	
	public static void file(int n) {
		
		List<JconsoleTest> list = new ArrayList<JconsoleTest>();
		for(int i = 0;i < n;i++) {
			try {
				Thread.sleep(100);
				list.add(new JconsoleTest());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
