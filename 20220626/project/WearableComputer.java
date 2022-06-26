package project;

import inter.Wearable;

public class WearableComputer implements Wearable {

	@Override
	public void putOn() {
		System.out.println("컴퓨터를 입는다");

	}
	@Override
	public void putOff() {
		System.out.println("컴퓨터를 벗는다");
	}
	
	public void reset() {
		System.out.println("컴퓨터를 재 시작합니다.");
	}

}
