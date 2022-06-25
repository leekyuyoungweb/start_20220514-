package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * List = ArrayList
 * Set = HashSet
 * Map = HashMap
 *
 */
public class Demo3 {

	public static void main(String[] args) {
		//List<E>
		// 국영수 관리한다.
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("국어", 95);
		map.put("영어", 98);
		map.put("수학", 100);
		System.out.println(map);
		System.out.println(map.get("영어"));
		
		// 영어점수를 100으로 수정 - 곧 입력이다.... 영어점스를 100으로 다시입력하면된다.
		map.put("영어", 100);
		System.out.println(map);
		
		// map을 다루는 방법들...
		Set<String> keys =  map.keySet(); // 키값의 묶음
		Collection<Integer> values = map.values();	// value의 묶음	
		Set<Entry<String, Integer>> entry = map.entrySet(); // key value를 각각  쌍으로 관리
		
		// 각각 foreEach사용법
		// 배열
		// 1. list
		Integer[] ary = {1,3,5,7,1,3,10};		
		List<Integer> list = Arrays.asList(ary);
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(ary));
		
		Map<Integer, Integer> newMap = new HashMap<Integer, Integer>();
		newMap.put(1, 100);newMap.put(2, 200);newMap.put(3, 300);newMap.put(4, 400);newMap.put(5, 500);
		
		//  순환문을 이용해서 해당데이터를 순차적으로 출력
		for (Integer data : ary) {
			System.out.println("정수형 배열 :" + data);
		}
		for (Integer data : list) {
			System.out.println("정수형 list :" + data);
		}
		for (Integer data : set) {
			System.out.println("정수형 set :" + data);
		}
		// map 출력		
		// key:1  value:100
		// key:2  value:300		
		//System.out.printf("key:%d  value:%d",0,0);
		for (Integer key : newMap.keySet()) {
			System.out.printf("key:%d  value:%d\n",key,newMap.get(key));
		}
		
		Set<Entry<String, Integer>> entris = map.entrySet();
		for (Entry<String, Integer> e : entris) {
			System.out.printf("key:%d  value:%d\n", e.getKey(), e.getValue() );
		}
		
//		for (Map.Entry<keyType, valType> entry : map.entrySet()) {
//			keyType key = entry.getKey();
//			valType val = entry.getValue();
//			
//		}
		
		

	}

}
