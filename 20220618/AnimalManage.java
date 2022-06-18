/**
 * 다형성의최대 장점
 * 1. 객체를 부모타입의 객체로 표현할수있어서 여러 자식 객체들은 부모타입 하나로 관리 편리
 * 2. 이렇게 한 부모타입으로 담긴 객체는 그 부모와 자식이 override 관계에 있는 함수는
 * 부모객체로 호출해도 동작은 실제 담긴 자식 객체의 override된 함수가 실행된다.
 */
public class AnimalManage {

	public static void main(String[] args) {
		// 강아지와 고양이를 배열로 관리하고 싶다.
		Animal[] animal = {
			new Cat(), new Dog(), new Cat(), new Dog()	
		};
		
		for (Animal ani : animal) {  // 읽기 전용
			ani.show();
		}
	}

}
