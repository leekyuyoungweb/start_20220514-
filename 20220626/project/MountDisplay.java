package project;

import inter.Skinable;
import inter.Wearable;

public class MountDisplay implements Skinable, Wearable {

	protected Color color;	
	
	@Override
	public void putOn() {		
		System.out.println("디스플레이 장착");
	}

	@Override
	public void putOff() {		
		System.out.println("디스플레이 탈거");
	}

	@Override
	public void changeSkin(Color color) {
		this.color = color;
	}
	

	@Override
	public String getSkin() {
		switch (color) {
			case BLACK:	return "BLACK";			
			case BLUE:	return "BLUE";
			case GREEN:	return "GREEN";
			case RED:	return "RED";
			case YELLOW:return "YELLOW";
			default: return null;			
		}		
	}

}
