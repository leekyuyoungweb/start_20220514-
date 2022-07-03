package lambda;
/**
 * 람다는 누군가를 참조할수 있다.
 * 정적메서드 참조  		클래스이름::정적메서드
 * 인스턴스 메서드 참조   	객체이름::인스턴스메서드(또는 클래스이름::인스턴스메서드)
 * 생성자 참조				클래스이름:new 또는 배열타입이름::new   ---> 이 소스에는 생성자 참조 예제가 없음
 * @author User
 *
 */
interface Mathematical{
	double calculate(double d);
}
interface Pickable{
	char pick(String s, int i);
}
interface Computable{
	int compute(int x, int y);
}

class Utils{
	int add(int a, int b) {
		return a+b;
	}
}

interface ApplyAble{
	boolean apply(Box a, Box b);
}
class Box{
	int no;

	public Box(int no) {
		super();
		this.no = no;
	}
	boolean isSame(Box b) {
		return this.no == b.no;
	}
}

public class Demo3 {

	public static void main(String[] args) {
		ApplyAble app;
//		app = (a, b) -> a.isSame(b);
		app = Box::isSame;
		System.out.println(app.apply(new Box(1), new Box(2)));
		System.out.println(app.apply(new Box(1), new Box(1)));
		
		Mathematical m;
		Pickable p;
		Computable c;
		
		//(a <= 0.0D) ? 0.0D - a : a;
		m = a ->  (a <= 0.0D) ? 0.0D - a : a;
		
//		Math.abs(10);
		m = Math::abs;
		m.calculate(-12.50);  // Math::abs
		
		String s = new String("안녕하세요 저는 홍길동 입니다.");
		System.out.println(s.charAt(4));
		
		p = String::charAt;
		System.out.println(p.pick("안녕하세요 저는 홍길동 입니다.", 4) );
		
		Utils utils = new Utils();
		c =  utils::add;
		System.out.println(c.compute(10, 20));
	}

}
