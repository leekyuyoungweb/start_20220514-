package GenericDemo;

import generic.Entry;

public class EntryDemo {

	public static void main(String[] args) {
		Entry<String, Integer> e1 = new Entry<String, Integer>("홍길동", 100);
		Entry<String, Integer> e2 = new Entry<String, Integer>("임꺽정", 200);
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());

	}

}
