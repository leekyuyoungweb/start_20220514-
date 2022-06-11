
public class Student {
	int age;
	String name,addr;	
	int[] score = new int[4];
	String[] score_name = {"kor","eng","math","sci"};	
	
	int total;
	double avg;
	int rank;
	
	// 총점
	void totalScore() {
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
		
	}
	// 평균
	void average() {
		avg = total / (double)score.length;
	}

}
