package trycatch;
/**
 * 양방향에서 예외를 처리하기위해  
 * 예외가 발생한곳에서 예외를 처리하고 그와 별개로 다시 예외를 throw해서 호출한 메소드에게 
 * 예외가 발생할 수 있다는 정보를 제공해서
 * 해당 코드에서 예외를 처리 할 수 있게 강제한다
 * @author User
 *
 */
public class Temp2 implements AutoCloseable {
	public void show() {
		System.out.println("자원사용");
	}
	
	
	public void close() throws InterruptedException  {
		System.out.println("자원반납");
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new InterruptedException(); // 강제로 예외를 발생시키기
		}
	}

}
