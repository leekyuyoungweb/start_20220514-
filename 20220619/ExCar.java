// 생성자는 반드시 부모의 생성자를호출한다. 이때 동일한 생성자를 호출
// 디폴트는 부모의 디폴트 생성자를 호출
// 매개변수 생성자는 부모의 매개변수 생성자를호출
public class ExCar extends Car{
	private double totalMileage; // 총 주행거리

	// 부모의 생성자와 동일한 생성자를 만들어보세요
	// 자식의 모든 생성자는 기본적으로 부모의 기본생성자를 호출하게 되어 있다..
	// 생성자에서는 다른 생성자를 호출할수 있다... 
	// 만약 부모의 생성자를 호출하려면 super 키워드를 사용하고
	// 자신의 생성자를호출할때는 this를 사용한다.

	public ExCar(String name, int width, int height, int length, double fuel, String puchaseDay) {
		super(name, width, height, length, fuel, puchaseDay);
		totalMileage = 0.0;
	}

	@Override
	public void getSpec() {		
		super.getSpec();
		System.out.printf("총 마일리지 : %.2f\n",totalMileage);
	}

	// 
	@Override
	public boolean move(double dx, double dy) {		
		// 부모의 기능중에 없는 마일리지 누적하는기능을 추가해서 로직을 새로 만든다.. 
		// 이때 부모의 기능이나 또는 로직을 이용
		double currentDistance =  Math.sqrt(dx*dx + dy*dy);
		if(!super.move(dx, dy))
			return false;
		totalMileage += currentDistance;
		return true;
	}
	
	
	// 맴버변수를  초기화하는 생성자 - totalMileage 를 어떻게 관리할껀가?  값을 셋팅하는 방법과 값을 반환하는 방법
	// 부모의 함수들중에서 과연 그대로 써도 될까?
	//   1.  getSpec()함수는?
	//   2.  move()함수는?
	
	
}
