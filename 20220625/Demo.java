package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * List : 저장순서가 있음, 중복을 허용함
 * Map : dictionary라고도 함(json)... key:value   key는 set의 속성을 가지고 있음
 * Set : 중복을 허용하지 않음... 순서가 보장 안됨
 * 재너릭 - 타입을 한정시키는역활 - 동일한 데이터 타입  < >
 * 내부적으로 배열을 개선... -- 동일한 데이터 타입
 * 
 *
 */
public class Demo {

	public static void main(String[] args) {
		// set
		Set<Integer> set = new HashSet<Integer>();
		set.add(5);
		set.add(4);
		set.add(3);
		set.add(3);
		set.add(10);
		System.out.println(set);
		
		Object[] ary =  set.toArray();
		int a = (int) ary[0];
		
		List<Integer> list = new ArrayList<Integer>(set);
		
		
		
		
		
		
		
		

	}

}
