
public class Demo7 {

	// Ŭ������ ��Ͽ��� ����Ǿ��⶧���� Ŭ���� �����̰�.. Ŭ��������
	// �Ǵ� �ν��Ͻ� ����(instance variable)
	int num1;
	
	// main �Լ�(�޼ҵ�)�ȿ��� ������ ������ Ŭ�������忡����
	// �� ���������̴�.
	public static void main(String[] args) {
		int num1 = 10; // ��������  global variable
		System.out.println(num1);
		
		// ������ ������ ���� �������� �������.
		// �������ٴ�-> ������ �� �Ǿ���..�� ��������.
		{
			System.out.println(num1);
			int num2 = 20; // ��������  local variable
			System.out.println(num2);
		}
		
//		System.out.println(num2);
	}

}
