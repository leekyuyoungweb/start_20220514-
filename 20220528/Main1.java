public class Main1 {

	public static void main(String[] args) {
		// 0.0*100 ~ 0.1*100 -->  0.0 ~ 100.0 
		//Math.random();  // Math라는 클래스의 random() 메소드를 호출
//		System.out.println( (int)(Math.random()*100) );

		// 0 ~ 100미만...
		// 1.10번 실행
		// 2. 7번 실행
		// 2번을 하되..... 범위를 0 ~ 45(45포함)
		
		
		// 0.0 ~ 0.1
		// 0.0 ~ 0.46
		// int(0.0) ~ int(46.234234)
		int randomSize = 7;	
		int rowCount = 5;
		for (int m = 0; m < rowCount; m++) {
			for (int i = 0; i < randomSize; i++) {  // hard cording			
				System.out.printf("%d ",  (int)(Math.random()*46));
			}
			System.out.println();	
		}
		
		
		
	}

}
