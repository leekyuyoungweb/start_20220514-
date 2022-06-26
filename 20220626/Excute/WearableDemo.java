package Excute;

import java.util.ArrayList;
import java.util.List;

import inter.Wearable;
import project.HeadPhone;
import project.WearableComputer;

public class WearableDemo {

	public static void main(String[] args) {
		// project 패키지에 있는 클래스를 저장해 보세요.
		List<Wearable> lists = new ArrayList<Wearable>();
		lists.add(new HeadPhone());
		lists.add(new HeadPhone());
		lists.add(new WearableComputer());
		lists.add(new HeadPhone());
		
		for (Wearable wearable : lists) {
			wearable.putOn();
		}
		

	}

}
