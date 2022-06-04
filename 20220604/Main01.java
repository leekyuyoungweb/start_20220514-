import java.util.Iterator;
import java.util.Scanner;

/**
 * 배열을 응용한 투표 시스템
 * 유권자가 10명 이라고 가정(10번 입력받아야 함)
 * 
 * 1. 입력시 유효범위를 넘어가면... 에러가발생함... 배운범위내에서 적당히 처리할것
 * 2. 동수면... 해당하는 후보자를 출력
 * 3. 동률인 후보자만 다시투표
 */
public class Main01 {

	public static void main(String[] args) {
		int voter = 10; // 유권자수		
		String[] candidates = {"","홍길동","이순신","강감찬","철이","순이"};
		Scanner sc = new Scanner(System.in);		
		int[] getVoteofCandidate = new int[candidates.length+1]; // 정수형 배열의 기본 값은 0이다.	
		
		for (int t = 0; t < voter; t++){
			// 1.홍길동 2. 이순신  3. 강감찬 4. 철이  5. 순이
			// 후보자출력
			for (int i = 1; i < candidates.length; i++) {
				String string = candidates[i];
				System.out.printf("%d.%s ",i, string);			
			}
			System.out.println(); // 줄 바꿈
			System.out.println("후보자를 선택해 주세요");
			int vote =  sc.nextInt();  // 화면에서 입력한 값을 정수로 변환
			getVoteofCandidate[vote]++;
		}
		// 투표가 끝
		// 투표용지를 검색해서 가장 많은 득표를 얻은 사람을 당선인으로 출력
		int max = getVoteofCandidate[0];
		int index = 0;
		for (int i = 1; i < getVoteofCandidate.length; i++) {
			if(max < getVoteofCandidate[i]) {
				max = getVoteofCandidate[i];
				index = i;
			}
		}
		// 결과출력
		System.out.printf("당선인 %s, 득표수:%d \n", candidates[index], max);
		
	}
}





