package member;

import sample.A;

public class C2 extends A {
	void test() {
		super.protected_value_a = 10;
		super.public_value_a = 10;		
	}
}

/*	접근제한자
 *  public : 제약이 없다... 어디서든지 사용가능
 *  private : 선언된 클래스 안에서만 사용가능 
 *  protected : 동일패키지 안에서는 사용가능, 다른 패키지에서 사용불가능(단 상속일때는 가능)
 *  생략 : 동일패키지 안에서는 사용가능, 다른 패키지에서 사용불가능(상속도 안됨)
 *  
 *  패키지
 *  동일패키지 : private 을 제외한 모든 접근제한자가 사용가능
 *  다른패키지 : public만 사용가능(단.. 상속일때는 protected 사용가능)
 *  
 *  -- private은 예외가 없다... 
 *  1. 같은패키지 안에서는 다 사용가능
 *  2. 패키지가 다르면 public 사용 가능(상속일때도 public만 가능하지만 예외적으로 protected를 만들어서 가능하게함)
 *  
 *  
 *  
 *  1. pivate은 클래스안에서만(상속도 안됨)  -그런데 상속만 허용 protected
 *  2. public은 제약 없음
 *  
*/
