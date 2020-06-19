package volatiledemo;

public class TestVolatile {

	public static void main(String[] args) {
		VolatileThread vt = new VolatileThread();
		new Thread(vt).start();
		while(true) {
//			synchronized (vt) {
				if(vt.isFlag()) {
					System.out.println("===================");
					break;
				}
//			}
		}
	}
}

class VolatileThread implements Runnable {

	private volatile boolean flag = false;
	@Override
	public void run() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
		}
		flag = true;
		
		System.out.println("flag=" + isFlag());
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}
