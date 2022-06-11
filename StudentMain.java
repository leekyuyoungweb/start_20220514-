import java.util.Random;

public class StudentMain {

	public static void inputData(Student[] students) {
		Random r = new Random();
		// 데이터 입력
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].name = "student"+i;
			students[i].addr = "address"+i;
			for (int j = 0; j < students[i].score.length; j++) {
				students[i].score[j] = r.nextInt(100);
			}
			students[i].totalScore();
			students[i].average();
		}
		sortStudents(students); // 정렬
		makeRankStudents(students); //등수카운팅
	}
	// 출력
	public static void showStudents(Student[] students) {
		System.out.printf("no\trank\tname\t\taddress\t\tkor\teng\tmath\tscience\ttotal\tavg\n");
		System.out.println("-----------------------------------------------------------------------------------");
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			System.out.printf("%d\t%d\t%s\t%s\t",i+1,student.rank,student.name,student.addr);
			for (int j = 0; j < student.score.length; j++) {				
				System.out.printf("%d\t",student.score[j]);
			}
			System.out.printf("%d\t%.2f",student.total,student.avg);
			System.out.println();
		}
	}
	//정렬
	public static void sortStudents(Student[] students) {
		for (int c = 0; c < students.length; c++) {
			for (int i = 0; i < students.length-1; i++) {
				if(students[i].total < students[i+1].total) {
					Student t = students[i];
					students[i] = students[i+1];
					students[i+1] = t;
				}
			}	
		}
	}
	//등수카운팅
	public static void makeRankStudents(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			students[i].rank = i+1;
		}
	}
	public static void main(String[] args) {		 
		// 객체지향 프로그래밍에서 클래스를 만들었다면.
		// 그 클래스타입의 객체를 만들어서 그 객체를 가지고 사용
		// 10명의 학생을 관리		
		
		// 학생객체가 10개 필요
		Student[] students = new Student[10];		
		inputData(students); // 데이터 입력		
		showStudents(students); //  출력
		
		
		
		
		// 배열 정렬 큰걸 앞으로... 내림차순.. descending
//		Integer[] ary = {5,1,4,8,4,5,17,12};
//		for (int c = 0; c < ary.length; c++) {
//			for (int i = 0; i < ary.length-1; i++) {
//				if(ary[i] < ary[i+1]) {
//					int t = ary[i];
//					ary[i] = ary[i+1];
//					ary[i+1] = t;
//				}
//			}
//		}		
		
		// 간단히 for문 없이 배열의 값을 문자형으로 출력해서 확인용
		//System.out.println( Arrays.toString(ary) );
		
		// 라이브러리를 이용해서 배열을 정렬
		//Arrays.sort(ary, Collections.reverseOrder());
		
		
		
		
		
		
		
		
		

	}

}
