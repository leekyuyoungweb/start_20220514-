package project;

import inter.Skinable;

public class SkinableComputer implements Skinable {
	
	private Color color;
	public String getSkin() {
		switch (color) {
		case BLACK: return "BLACK";
		case RED: return "RED";
		case GREEN : return "GREEN";
		case BLUE: return "BLUE";
		case YELLOW: return "YELLOW";		
		}
		return "";
	}

	@Override
	public void changeSkin(Color color) {
		this.color = color;		
	}
	

}
