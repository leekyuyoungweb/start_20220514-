package inter;

import project.Color;

// changeSkin 메서드를 가지는 클래스를 구현
// 인터페이스는 맴버변수를 가질수 없다... 오로지 final로 선언된 상수형 변수만 가질수 있다.
public interface Skinable {
//	int BLACK = 0;
//	int RED = 1;
//	int GREEN = 2;
//	int BLUE = 3;
//	int YELLOW = 4;
	void changeSkin(Color color);	
	public String getSkin(); 
}
