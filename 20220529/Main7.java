
public class Main7 {

	public static void main(String[] args) {
//		1. �ڷ����� double �̰� ��Ҽ��� 5�� �迭�� ����, ��� ��� ���
		double[] nums = new double[5];
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);			
		} 
		
		
		System.out.println("-----------------------------");
//		2. ��Ұ����� 5���� int�� �迭�� ������� 5 4 3 2 1�� �����ϰ� �������
		int[] intnums = new int[5];
//		for (int i = 0,m = 5  ; i < intnums.length; i++, m--) {
//			intnums[i] = m;
//		}
		for (int i = 0; i < intnums.length; i++) {
			intnums[i] = intnums.length-i;
		}
		for (int i = 0; i < intnums.length; i++) {
			System.out.println(intnums[i]);
		}
		System.out.println("-----------------------------");
		
//		3. ��� ������ 5�� double �� �迭�� ����� �տ������� 1.1,2.2,3.3,4.4,5.5�� 
//		�����ؼ� ǥ���ϴ� ���α׷�
		double[] darray = new double[5];
		for (int i = 0; i < darray.length; i++) {
			darray[i] = 1.1*(i+1);
		}
		System.out.println("---------------------------");
		
//		5. �迭�� ����� ������ �Է¹޴´�.. �׸��� �� ��Һ��� ���� �Է¹޾Ƽ� ǥ���ϴµ�
//		�� ����� ���� �޸��� �����ϰ� {}�� ���μ� ���
//		��)  �迭�� ���� 1 2 3 �̷��� ������� �Է������� �����
//		{1,2,3} �̷���..
		
		

	}

}










