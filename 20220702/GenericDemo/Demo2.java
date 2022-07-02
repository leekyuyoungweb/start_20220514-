package GenericDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * 모든타입의 요소를 출력하는 method를 정의
 * int, double, string,
 * @author User
 *
 */
public class Demo2 {
	
	public static<T> void showAry( T[] intary   ) 
	{				
		for (T t : intary) {
			System.out.println(t);
		}		
	}	
	
	public static<T> int showLength(T[] intary   )
	{
		return intary.length;
	}
	
	// 배열의 마지막 값 출력
	public static<T> T getLastData(T[] intary   )
	{
		return intary[intary.length-1];
	}
	
	public static void main(String[] args) {
		Integer[] intary = {1,2,3};
		Double[] doubleary = {11.5,12.5,13.5};
		String[] strary = {"이름","주소","나이"};
						
		showAry(strary);	
		System.out.println(showLength(strary));
		System.out.println(getLastData(strary));
		
	}	

}
