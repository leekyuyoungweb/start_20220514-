/**
 * 
 * 은닉화  - private
 * 갭슐화  - private
 * 맴버변수는 private
 * 맴버변수에 접근할수 있는 get--  set--- 메소드를 제공
 * get--  set--- 메소드는 상황에 따라서 validation check  유효성검사
 * 이름은 공백이올수 없다
 * height 0보다 크고 300 이하여야한다
 * weight 0보다 크고 1000 이하여야한다
 */


public class Human {
	private String name;
	private int height,weight;
	
	boolean setName(String name) {
		if(name !="") {
			this.name = name;
			return true;
		}
		else {
			System.out.println("이름에 공백이 올수 없습니다.");
			return false;
		}	
	}
	String getName() {
		return name;
	}
	
	boolean setHeight(int height) {
		if(height > 0 && height < 300) {
			this.height = height;
			return true;
		}
		else {
			System.out.println("0과 300사이의 정수를 입력하세요");
			return false;
		}
	}
	int getHeight() {
		return height;
	}
	
	boolean setWeight(int weight) {
		if(weight > 0 && weight < 1000) {
			this.weight = weight;
			return true;
		}
		else {
			System.out.println("0과 1000사이의 정수를 입력하세요");
			return false;
		}
	}
	int getWeight() {
		return weight;
	}
}
