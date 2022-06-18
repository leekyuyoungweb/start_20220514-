
public class Child extends Human{
	private int age;
	
	public long getPrice() {
		return (long) (12000 * 0.5);
	}
	
	public Child(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}
