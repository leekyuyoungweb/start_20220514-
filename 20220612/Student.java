
public class Student {

	private String name;
	private int age, jumsu;
	
	public Student() {}
	
	public Student(String name, int age, int jumsu) {	
		this.name = name;
		this.age = age;
		this.jumsu = jumsu;		
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
	public boolean setAge(int age) {
		if(age > 0 && age<150) {
			this.age = age;
			return true;
		}
		return false;
	}
	public int getJumsu() {
		return jumsu;
	}
	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}
	@Override  // overwrite  재정의
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", jumsu=" + jumsu + "]";
	}
	// 메소드 생성
	public void Add(int a, int b) {System.out.println(a+b);}
	// orverload
	public void Add(double a, double b) {System.out.println(a+b);}
	
}
