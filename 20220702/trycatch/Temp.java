package trycatch;

public class Temp implements AutoCloseable {
	public void show() {
		System.out.println("자원사용");
	}
	
	
	public void close() throws InterruptedException {
		System.out.println("자원반납");
		Thread.sleep(0);
	}

}
