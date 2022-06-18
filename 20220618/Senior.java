
public class Senior extends Human{
	private int age;
	
	public long getPrice() {
		return (long) (12000 * 0.75);
	}
	
	public Senior(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
}
