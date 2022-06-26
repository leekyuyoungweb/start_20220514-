package project;
//1
// 자기이름, 주인이름
// 자기소개함수...(자기이름과 주인이름을 출력)

//pet을 상속한 RobotPet 
// + work 메소드를 추가로 가지고 있다
public class Pet {
	protected String name, ownerName;

	public Pet(String name, String ownerName) {
		this.name = name;
		this.ownerName = ownerName;
	}
	@Override
	public String toString() {
		return String.format("애완동물이름은 %s, 주인은 %s", name, ownerName);
	}	
}
