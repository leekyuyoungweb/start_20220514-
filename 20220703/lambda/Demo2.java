package lambda;

interface Negative{
	int neg(int x);
}

interface Printable{
	void print();
}

// (타입 변수명) -> {내용; 내용;}
// 타입은 생략가능, {} 도 내용이 하나면 생략가능
public class Demo2 {

	public static void main(String[] args) {
		// 익명 클래스
		Negative n = new Negative() {			
			@Override
			public int neg(int x) {				
				return -x;
			}
		};
		n.neg(10);
		
		Negative n2;
		n2 = (int x) ->{return -x;};
		n2 = (x) -> {return -x;};
		n2 = x -> {return -x;};
		n2 = (x) -> -x;
		n2 = x -> -x;
		System.out.println(n2.neg(100));
		
		
		Printable p;
		p = () -> {System.out.println("hello");};
		p = () -> System.out.println("hello");
		p.print();
		

	}

}
