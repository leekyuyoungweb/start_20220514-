
public class UsingObject2 {

	// 다형성
	public static void  getObject(Object obj) {
		if(obj instanceof String)
			System.out.println("넌 문자열이야..");
		else if(obj instanceof Integer)
			System.out.println("넌 정수야..");
		else
			System.out.println("문자열과 정수가 아닌 다른타입의 객체 입니다. ");
	}
	
	public static void main(String[] args) {
		getObject(new String("안녕하세요"));
		getObject(100);
		getObject(12.5);
	}

}
