package product;
import java.text.SimpleDateFormat;
import java.util.Date;

/**  
 * 필드 정의 
 * 주행거리 : distance - private 
 */
public class Car {
	protected String name;				// 자동차명
	protected int width,height,length;	// 가로 세로 폭
	protected double x, y, fuel;			// x좌표 y좌표  남은연료량
	protected String puchaseDay;  		// 구입일 

	
	public Car(String name, int width, int height, int length,  double fuel) {
		super();
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.x = 0.0;
		this.y = 0.0;
		this.fuel = fuel;		
		puchaseDay = getCurrentDateForString();
		
	}
	
	private String getCurrentDateForString() {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일");
		String myDate = sd.format(new Date());
		return myDate;
	}
	
	// x y fuel purchaseDay  -- getter 만들기	
	public String getPuchaseDay() {	return puchaseDay;}
	public double getX() {return x;}
	public double getY() {return y;}
	public double getFuel() {return fuel;}
	
	// 자동차의 사양을 표시하는 method  이름 : getSpec()   이름, 전폭, 전고 전장
	public void getSpec() {
		String str = String.format("구입날자 : %s\n이름 : %s\n전폭 : %d\n전고 : %d\n전장 : %d\n남은연료량 : %.2f", 
				puchaseDay,name,width,height,length,fuel);
		System.out.println(str);
	}
	
	// 자동차를 특정 좌표로 이동시키는 함수 move(dx, dy)   외부로부터 좌표값을 받아서 처리  x방향으로 dx 만큼이동   
	//  이동거리를 구한다...  root(x2 + y2)    Math.sqrt(x2 + y2) --> distance
	//  distance = Math.sqrt(x2 + y2)
	// 연료는 주행거리만큼 줄어든다   fuel -= distance
	public boolean move(double dx, double dy) {
		double currentDistance =  Math.sqrt(dx*dx + dy*dy);
		if(currentDistance > fuel)
			return false;					
		fuel -= currentDistance;		
		x += dx;
		y += dy;
		return true;
		
	}
	
}
