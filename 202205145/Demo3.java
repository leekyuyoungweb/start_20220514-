
public class Demo3 {

	public static void main(String[] args) {
		// type casting (�� ��ȯ)
		int num1 = 100, num2 = 200;
		// ���ڿ� + ���Ÿ�� ---> ���ڿ� + ���ڿ�
		System.out.println("���ϱ� :" + (num1+num2) );
		System.out.println("���� :" + (num1-num2) );
		System.out.println("���ϱ� :" + (num1*num2) );
		// ���� / ������ ����� �����̱� ������
		// �Ǽ� / �Ǽ� ���·� ������ ��� �Ѵ�.
		// type ��ȯ��  ������ �տ� (Ÿ��) �� �����ش�.
		System.out.println((num1));
		System.out.println(((double)num1));
		System.out.println("������ :" + ((double)num1/(double)num2) );	

	}

}
