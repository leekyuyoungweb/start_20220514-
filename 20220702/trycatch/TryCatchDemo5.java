package trycatch;

public class TryCatchDemo5 {
	public static int inputData() throws CheckAge {
		System.out.println("나이를 입력하세요");
		// 로직....
		int age = 50;
		boolean isInBoundAge = age >0 && age < 151;
		if( !isInBoundAge ) {
			throw new CheckAge("나이의 범위가 1~150사이여야만 합니다.");
		}
		return age;
	}
	

	public static void main(String[] args) {
		try {
			int age = inputData();
		} catch (CheckAge e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();  log4g를 이용해서 web에서는 file에 기록한다.
			System.out.println("다음과 같은 에러가 발생했습니다." + e.getMessage());
		}

	}

}
