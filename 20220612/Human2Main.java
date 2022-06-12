
public class Human2Main {

	public static void main(String[] args) {
		//1. 홍길동, 조선팔도, 100, 190, 120
		//2. 김삿갓, 조선팔도, 50, 160, 50
		
		// 각각의 객체가 가지는 모든 맴버변수의 내용을 출력
		int a = 10;
		int b;
		b = 20;
		
		int[] ary = {1,2,3,};
		int[] ary2 = new int[3];
		ary2[0] = 0;
		ary2[1] = 1;
		ary2[2] = 2;
		
		// 생성자 - constructor  -- 객체를 만들때 자동으로 호출되는 함수(메소드) - 기본은hidden
		System.out.println("객체생성전-------------");
		Human2 hh = new Human2("홍길동", "조선팔도", 50, 190, 120);		
		System.out.println("객체생성후-------------");
		System.out.println(hh.getAddress());
		
		System.out.println(hh);
		System.out.println(hh.toString());
		
		
		//hh.allSettings("홍길동", "조선팔도", 100, 195, 120);
		
		
		

	}

}
