
public class Method7 {

	// ����Ÿ�� �ִ��� ������ ���� �ִٸ� �Ÿ��
	// �Ű������� �ִ��� ������ ���� �ִٸ� ��Ÿ���� �
	
	// ����Ÿ���� x
	// parameter 1��.. �迭��Ÿ��
	
	public static void showArrays(Object[] array) {		
		for (int i = 0; i < array.length; i++) {
			System.out.println( array[i]);
		}
	}	
	public static void main(String[] args) {
		Object[] ary = {1,2,3,4,5};
		Object[] names = {"a","b","c"};
		Object[] dary = {1.1,2.2,3.3};		
		// ������ �迭�� ��� ��Ҹ� ���
		showArrays(ary);
		showArrays(names);
		showArrays(dary);
	}

}
