
public class Method2 {

	public static String greeting(String name ) {
		String str = String.format("�ȳ��ϼ��� %s�� �ݰ����ϴ�.", name);
		return str;		
	}
	
	
	
	public static void main(String[] args) {
		String name = "�̱Կ�";		
		String result = greeting(name);
		System.out.println(result);
		

	}

}
