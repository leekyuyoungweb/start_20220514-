package project;

import inter.Skinable;

// skinable을 상속받아서 그걸 적절히 클래스내에서 적용해 보자..
public class RobotPet extends Pet implements Skinable{

	public RobotPet(String name, String ownerName) {
		super(name, ownerName);
	}	
	public void work() {
		System.out.println("work");
	}
	@Override
	public String toString() {
		return String.format("애완로봇이름은 %s, 주인은 %s", name, ownerName);
	}
	 

	@Override
	public String getSkin() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void changeSkin(Color color) {		
		switch (color) {
		case BLACK: break;
		case BLUE: break;
		case GREEN: break;
		case RED: break;
		case YELLOW: break;

		default:
			break;
		}
		
	}
	
	
}
