
public class Teenager extends Human{
	private int age;

	public long getPrice() {
		return (long) (12000 * 0.8);
	}
	
	public Teenager(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
}
