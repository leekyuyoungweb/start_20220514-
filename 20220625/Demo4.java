package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo4 {

	public static void main(String[] args) {
		// sort
		Integer[] ary = {1,3,5,7,2};
		Arrays.sort(ary); // default 오름차순
		// 1.
//		for (int data : ary) {
//			System.out.println(data);
//		}
		//2 . 리스트에 넣어서 그 객체를 출력 non use loop
		List<Integer> list = Arrays.asList(ary);
		System.out.println(list);
		
		// 내림차순.... 정렬은 기본적으로 오름차순을 제공.... 반대는 
		Arrays.sort(ary,Collections.reverseOrder()); // 내림차순
		System.out.println(Arrays.asList(ary));
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(3, 100);map.put(5, 200);map.put(1, 300);map.put(4, 400);map.put(2, 500);
		System.out.println(map);
		// entryset은 키를 오름차순으로 정렬
		Set<Entry<Integer, Integer>> set = map.entrySet();
		for (Entry<Integer, Integer> entry : set) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		// key를 중심으로 내림차순으로 정렬
		Set<Integer> tempsets =  map.keySet();
		System.out.println(tempsets);
		List<Integer> templist = new ArrayList<Integer>(tempsets);
		System.out.println(templist);
		Object[] objs =  templist.toArray();
		Arrays.sort(objs,Collections.reverseOrder());
		System.out.println(Arrays.asList(objs));
		for (Object key : Arrays.asList(objs)) {
			Integer skey = (Integer)key;
			System.out.println(skey+" "+map.get(skey));
		}
		// 정리
		// map은 데이터를 넣을때.. key를 오름차순으로 정렬해서 넣는다.
		// 내림차순으로 정렬해보고싶은때는 key만 가져와서 리스트에 넣고 오름차순으로 정렬해서.. map으로 key value를 가져온다
		
		
		
		
		// value를 중심으로 정렬
		
		

	}

}
