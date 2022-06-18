/**
영화관 입장료 계산 프로그램
기본요금은 12000
할인조건
  - 청소년 : 20% 할인 , 12~19   객체  class
  - 어린이 : 50% 할인 , ~11	  객체  class
  - 노약자 : 25% 할인 , 65~	  객체  class
  객체 instanceof 타입  --> 객체가 원하는타입이면 true 
  obj instanceof String  
 */
public class MyProgram1 {
	public static Long getTotalEntryPrice(Human[] peoples) {
		long total = 0L;
		for (int i = 0; i < peoples.length; i++) {
			total += peoples[i].getPrice();
		}		
		return total;
	}
	
	public static void main(String[] args) {
		// 어린이 2명, 노약자 1명, 청소년 2명
		// 기본가격 12000
		// 1. 정말로 따로따로 객체 생성해서 관리할것인지?
		// 2. 입장료 계산은 외부 함수를 만들어서 처리하면 좋을거 같음		
		// 데이터 생성
		Human[] peoples = {
				new Teenager(12), new Teenager(15),new Teenager(17),
				new Child(10),new Child(8),new Senior(67), 
				new Adult() ,new Adult(),new Adult()
		};				
		// 함수호출
		long total = getTotalEntryPrice(peoples);
		String str =  String.format("총 입장 수입은 %d원 입니다.", total);
		System.out.println(str);
	}
}







