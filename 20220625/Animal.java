package collection;

// 추상화 클래스 == 맴버중에 한개이상이 abstract인 클래스 그래서 그 클래스 이름도 abstract
// 순수 추상화 클래스  = 모든 멤버메소드가 전부 abstract 인 클래스 ----> 인터페이스

// 인터페이스 : 메소드는 당연히 abstract이기때문에..
// 객체가 될수 없어서... 변수는 상수로만 표현 가능
public interface Animal {
	static final String name = "";	
	void bark(); 
	String getName();	
}
