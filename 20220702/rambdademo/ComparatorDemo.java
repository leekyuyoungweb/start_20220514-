package rambdademo;

import java.util.Arrays;
import java.util.Comparator;

class SortMyString implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}	
}

public class ComparatorDemo {

	public static void main(String[] args) {
		String[] strings = {
			"시간은 돈이다", "금과 돈","정렬"
		};		
		SortMyString s = new SortMyString();
		Arrays.sort(strings, s);
		System.out.println(Arrays.toString(strings));
		
		

	}

}
