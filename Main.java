public class Main {

	public static void main(String[] args) {
		Calc c = new Calc();   // c�� CalcŬ������ ��ü�����̰� ���� �Ҵ�޾���
		c.result = 10;			// ��ü�� ������ ���� result�� ���� �Ҵ�
		int result =  c.add(100); // ��ü�� ������ �޼ҵ带 ȣ��
		System.out.println(result);
		
		Calc c2=null;
		System.out.println(c2);
		
		int a = 0;
		System.out.println(a);		
		
		// �⺻����, ��������(��ü)  �ʱ�ȭ�ؾ� �Ѵ�
		// ���������� �⺻���� null
		// �⺻������ �⺻���� �� Ÿ�Կ� �´� �⺻��... 0, 0.0,  false
		//  -- ����  Ŭ�����ȿ��� ������ ����(������������)�� �⺻���� ���� �ʾƵ� �ڵ� ����
		
		
		Calc c3 = new Calc();
		
		
	}

}
