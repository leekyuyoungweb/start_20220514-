
public class Method5 {
	public static double calc(int num1,String op, int num2) {
		double result = 0.0;
		switch (op) {
		case "+": result = num1+num2; break;
		case "-": result = num1-num2; break;
		case "*": result = num1*num2; break;
		case "/": 		
			if(num2 != 0)
				result = num1 / num2;
			else
				System.out.println("0���� ������ �����ϴ�.");
			break;
		default:
			System.out.println("�����ڴ� + - * / �߿� �ϳ����� �մϴ�. ");
			break;
		}
		return result;
	}
	public static void main(String[] args) {
		int num1=10,num2=20;
		String op = "+";
		double result = calc(num1, op, num2);
		System.out.printf("%d %s %d = %.2f\n",num1,op,num2,result);
	}

}
