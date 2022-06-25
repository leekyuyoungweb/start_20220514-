package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Demo5 {
	
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(3, 100);map.put(5, 200);map.put(1, 500);map.put(4, 400);map.put(2, 500);
		
		// stream...  key를 중심으로 정렬
		List<Entry<Integer, Integer>> entries = 
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).collect(Collectors.toList());
		
		for (Entry<Integer, Integer> entry : entries) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}		
	}	
}
