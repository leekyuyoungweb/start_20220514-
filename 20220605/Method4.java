
/**
 * 
 * ���� ���� �ܼ��� ����
 * 4Ģ����... �� �����ڴ� �ΰ��� ����  + - * /
 * 1,"+",1  --> 1+1
 * 1,"-",1  --> 1-1
 *
 * (int num1, String op, int num2)
 */


public class Method4 {

	public static void calc(int num1,String op, int num2) {
		switch (op) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":			
			System.out.println(num1-num2);
			break;
		case "*":			
			System.out.println(num1*num2);
			break;
		case "/":			
			if(num2 != 0)
				System.out.println((double)num1/num2);
			else
				System.out.println("0���� ������ �����ϴ�.");
			break;
		default:
			System.out.println("�����ڴ� + - * / �߿� �ϳ����� �մϴ�. ");
			break;
		}
	}
	
	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		String op = "+";
		calc(num1, op, num2);
//		�Լ��̸�(num1,op,num2);   
		// �Լ����� ����Ұ����� �Ǵ� ����� �����ؼ�  ���⼭ ����� ��� 

	}

}
