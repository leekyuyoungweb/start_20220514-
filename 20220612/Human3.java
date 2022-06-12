// 1. 맴버변수는 private
// 2. 필요하면 getter / setter를 만든다... alt+shift+s
// 3. 맴버변수를 초기화 하는 매개변수 생성자를 만든다
// 4. 모든 맴버의 값을 확인이 용이하도록 toString() 만든다
// name,age
public class Human3 {
	private String name;
	private int age;
	
	
	public Human3(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human3 [name=" + name + ", age=" + age + "]";
	}
	
	
}
