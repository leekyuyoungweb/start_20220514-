/**
 * 
 * method == function
 * �޼ҵ�		 �Լ�
 * function  �� ��ü���� ����
 * 
 */
public class Method01 {

	public static void method1() {
		System.out.println("method1�� �޼ҵ� �Ǵ� �Լ��ε�. �Է°��� ���� ��°��� ���� ����");
		return;
	}
	
	public static int method3(int value, String name) {
		System.out.println(value + " method3�� �޼ҵ� �Ǵ� �Լ��ε�. �Է°��� �ְ� ��°��� �ִ� ���� "+name);
		return value;
	}
	
	public static void method2(int value) {
		System.out.println("method2�� �޼ҵ� �Ǵ� �Լ��ε�. �Է°��� �ְ� ��°��� ���� ����");
		return;
	}	
	
	
	public static int method4() {
		System.out.println("method3�� �޼ҵ� �Ǵ� �Լ��ε�. �Է°��� ���� ��°��� �ִ� ����");
		return 0;
	}
	
	
	public static void main(String[] args) {
		// ������ ȣ���Ҷ��� �����̸��� ���
		// �޼ҵ带 ȣ�⶧�� �̸�()
		System.out.println("�Լ�������");
		System.out.println( method3(10,"ö��")) ;
		System.out.println("�Լ�������");
		
	}

}










