import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {		
		System.out.println("국어 영어 수학점수를 공백을 기준으로 입력하세요");
		//80 80 90   83.333
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		//정수+정수+정수는 결과가 정수
		// 정수 / 정수  결과 정수
		
		double avg = ( kor+eng+math) / 3.0;
		System.out.println("평균은 : "+avg);
	}

}
