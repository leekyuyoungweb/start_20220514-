import java.text.SimpleDateFormat;
import java.util.Date;

public class ExCarDemo {

	public static void main(String[] args) {
		ExCar ec = new ExCar("abc", 100, 100, 100, 150, null);
		ec.getSpec();
		ec.move(10, 5);
		ec.getSpec();	
		
		
//		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일");
//		String myDate = sd.format(new Date());
//		System.out.println(new Date());
//		System.out.println(myDate);
	}

}
