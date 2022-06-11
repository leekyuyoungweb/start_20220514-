public class Main {

	public static void main(String[] args) {
		Calc c = new Calc();   // c는 Calc클래스의 객체변수이고 값을 할당받았음
		c.result = 10;			// 객체를 가지고 변수 result에 값을 할당
		int result =  c.add(100); // 객체를 가지고 메소드를 호출
		System.out.println(result);
		
		Calc c2=null;
		System.out.println(c2);
		
		int a = 0;
		System.out.println(a);		
		
		// 기본변수, 참조변수(객체)  초기화해야 한다
		// 참조변수는 기본값이 null
		// 기본변수의 기본값은 각 타입에 맞는 기본값... 0, 0.0,  false
		//  -- 예외  클래스안에서 정의한 변수(참조변수포함)는 기본값을 주지 않아도 자동 셋팅
		
		
		Calc c3 = new Calc();
		
		
	}

}
