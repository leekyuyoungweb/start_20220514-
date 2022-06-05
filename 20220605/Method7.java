
public class Method7 {

	// 리턴타입 있는지 없는지 만약 있다면 어떤타입
	// 매개변수가 있는지 없는지 만약 있다면 언떤타입의 몇개
	
	// 리턴타입은 x
	// parameter 1개.. 배열의타입
	
	public static void showArrays(Object[] array) {		
		for (int i = 0; i < array.length; i++) {
			System.out.println( array[i]);
		}
	}	
	public static void main(String[] args) {
		Object[] ary = {1,2,3,4,5};
		Object[] names = {"a","b","c"};
		Object[] dary = {1.1,2.2,3.3};		
		// 각각의 배열의 모든 요소를 출력
		showArrays(ary);
		showArrays(names);
		showArrays(dary);
	}

}
