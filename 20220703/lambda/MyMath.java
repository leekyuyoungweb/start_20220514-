package lambda;

public class MyMath {
	private int data;
	
	public MyMath(int data) {
		super();
		this.data = data;
	}

	public int abs() {
		return data > 0 ? data : -data;
	}
	
	public static int staticabs(int data) {
		return data > 0 ? data : -data;
	}
}
