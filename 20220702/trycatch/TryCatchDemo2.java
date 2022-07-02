package trycatch;

import java.util.Scanner;

public class TryCatchDemo2 {

	public static void main(String[] args) {
		int num1 = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("10을 나눌 숫자를 입력하세요");
		int num2 = sc.nextInt();		
		int result = num1 / num2;
		System.out.printf("%d / %d = %d\n",num1,num2,result);
		

	}

}
