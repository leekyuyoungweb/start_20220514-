public class Main1 {

	public static void main(String[] args) {
		// 0.0*100 ~ 0.1*100 -->  0.0 ~ 100.0 
		//Math.random();  // Math��� Ŭ������ random() �޼ҵ带 ȣ��
//		System.out.println( (int)(Math.random()*100) );

		// 0 ~ 100�̸�...
		// 1.10�� ����
		// 2. 7�� ����
		// 2���� �ϵ�..... ������ 0 ~ 45(45����)
		
		
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
