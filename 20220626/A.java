
// 제공받는 B의 서비스가 없어지고 C로 변경되면? 

public class A {

	private DataService dataService;
	
	public A(DataService dataService) {
		this.dataService = dataService;
	}
	// 데이터가 필요하고 그 데이터를 B클래스가 제공
	// B클래스를 직접 사용 --- A는 B에 의존한다.
	public void processing() {
		int a = dataService.getData();
		// 가공
		System.out.println(a+100);
	}
}
