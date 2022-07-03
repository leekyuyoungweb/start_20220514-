package lambda;
// 람다식의 this 키워드는 람다식을 실행한 외부객체를 의미한다.
interface UseThis{ 	void use(); 	}

class Temp{

	@Override
	public String toString() {
		return "Temp Class";
	}
	
}

class UseThisImple implements UseThis{
	@Override
	public void use() {
		System.out.println(this);		
	}	
}

public class Demo5 {
	public void lambda() {
		// 익명클래스를 이용한 객체
		UseThis ul = new UseThis() {			
			@Override
			public void use() {
				System.out.println(this);
			}
		};
		ul.use();
		
		//람다를 이용한 객체
		UseThis ul2 = () -> System.out.println(this);
		ul2.use();
	}	
	
	@Override
	public String toString() {
		return "UseThisDemo";
	}

	public static void main(String[] args) {
		new Demo5().lambda();
//		Temp t = new Temp();
//		System.out.println(t);
	}

}
