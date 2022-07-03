package lambda;

import java.net.InterfaceAddress;

/**
 * 람다는 누군가를 참조할수 있다.
 * 정적메서드 참조  		클래스이름::정적메서드			---> 이 소스에는  해당예제가 없음 demo3 참고할것
 * 인스턴스 메서드 참조   	객체이름::인스턴스메서드(또는 클래스이름::인스턴스메서드)	 ---> 이 소스에는  해당예제가 없음 demo3 참고할것
 * 생성자 참조				클래스이름:new 또는 배열타입이름::new   
 * @author User
 *
 */

interface NewObject<T>{
	T getObject(T o);
}

interface NewArray<T>{
	T[] getArray(int size);
}

public class Demo4 {

	public static void main(String[] args) {
		NewObject<String> s;
		NewArray<Integer> i;
		
//		s = x-> new String(x);
		s = String::new;
		String str = s.getObject("바나나");
		
//		Integer[] a = new Integer[10];
//		i = x -> new Integer[x];
		i = Integer[]::new;
		Integer[] ary =  i.getArray(10);
		System.out.println(ary.length);
	}

}
