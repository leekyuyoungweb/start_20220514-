import java.util.Scanner;

public class Exe {

	public static void main(String[] args) {
		// Student
		// 이름 나이, 점수  Scanner클래스를 이용해서 직접 각각 입력을 받아서 출력
		// 학생 수는 알아서 해서...
		// alt+shift+s 적극적으로 이용		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력하세요 : ");
		int number =  sc.nextInt();
		Student[] students = new Student[number];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			
			System.out.println("이름을 입력하세요");
			students[i].setName( sc.next());
			System.out.println("나이를 입력하세요");
			
			while (!students[i].setAge( sc.nextInt() )) {
				System.out.println("나이는 0 ~ 150 사이에 입력해야 합니다. 다시입력하세요");				
			}			
				
			System.out.println("점수를 입력하세요");
			students[i].setJumsu(sc.nextInt());
		}
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]); // 객체 자체를 출력하면 toString을 override 했기때문에 주소값이 아니라....
		}
		

	}

}
