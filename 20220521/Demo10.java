
public class Demo10 {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 50;
		
		// 1������
		if(number1 > 0) {
			if(number2 > 100) {
				System.out.println("number1�� 0���� ũ�� number2�� 100���� ũ��");				
			}			
		}
		// 1�������� ��ü�Ҽ� ����
		if(number1 >0 && number2 > 100) {
			System.out.println("number1�� 0���� ũ�� number2�� 100���� ũ��");
		}
		
		//2 ������
		if(number1 > 0) {
			if(number2 > 100) {
				System.out.println("number1�� 0���� ũ�� number2�� 100���� ũ��");				
			}
			else {
				System.out.println("number1�� 0���� ũ�� number2�� 100���� ũ���ʴ�");
			}
		}
		
		if(number1 >0 && number2 > 100) {
			System.out.println("number1�� 0���� ũ�� number2�� 100���� ũ��");   // true, true
		}else {
			System.out.println("number1�� 0���� ũ�� number2�� 100���� ũ���ʴ�"); // true false
			System.out.println("number1�� 0���� �۰� number2�� 100���� ũ��");    // false true
			System.out.println("number1�� 0���� �۰� number2�� 100���� ũ���ʴ�"); // false false
		}
		
		

	}

}
