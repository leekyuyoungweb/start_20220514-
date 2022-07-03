package lambda;
/**
 * (타입 매개변수) -> { 실행문; 실행문; }
 * @author User
 *
 */

interface Callable{
	public void show(String name);
}

class Test implements Callable{

	@Override
	public void show(String name) {	
		System.out.printf("hello %s\n",name);
	}
	
}

public class Demo1 {		
	public static void show(Callable c ,String name) 
	{
		c.show(name);
	}
	
	public static void main(String[] args) {
		// 함수의 파라메터로 함수자체를 java에서는 전달하지 못해서 객체를 전달하는 것으로 구현 
		show( new Test(), "홍길동" );
		show(name->System.out.printf("hello %s\n",name), "홍길동");
					
	}

}
