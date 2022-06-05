
public class method8 {
	// 정수형 변수 1개
	// 정수형 변수 2개
	// 정수형 변수 3개
	// 정수형 변수 4개
	// 정수형 변수 5개 를 갖는 함수를 설계
	
	// 객체지향의 가장 핵심개념인 overload -대표적인 케이스가 생성자 overload
	// constructor overload
//	public static void method(int num) {}
//	public static void method(int num, int num2) {}
//	public static void method(int num, int num2, int num3) {}
	// .. .. ..
	public static void method(int...num) {
		System.out.println(num.length);
		System.out.println(num[0]);
	}
	
	public static void main(String[] args) {
		method(1,2,3,4);
//		method(1,2);
//		method(1);
//		method(1,2,3,4,5,6,7,8,9,10,11,12);

	}

}
