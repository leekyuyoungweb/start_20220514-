package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		// Q 정수형 리스트를 만들어서 5개의 값을 받아서
		// 1. 최대 최소값 구해보고
		// 2. 혹시 중복값이 있으면 제거된 리스트를 구해본다.
		// 3. 순환문은 전통적인 for문을 사용하지 않는다.  forEach
		
		List<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			list.add(random.nextInt(10));			
		}
		System.out.println(list);
		
		// for
		for (Integer data : list) {
			System.out.println(data);			
		}
		
		Set<Integer> temp = new HashSet<Integer>(list);
		list = new ArrayList<Integer>(temp);
		System.out.println("중복이 있다면제거된 리스트의 값 : "+ list);
		
		System.out.println(	Collections.max(list));
		System.out.println(	Collections.min(list));
				
		
		
		

	}

}
