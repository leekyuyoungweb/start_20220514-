package project;

import inter.Wearable;

public class HeadPhone implements Wearable {
	private int volumn;
	
	@Override
	public void putOn() {
		System.out.println("해드폰을 쓴다");

	}

	@Override
	public void putOff() {
		System.out.println("해드폰을 벗는다");
	}

	public int getVolumn() {
		return volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	
	

}
