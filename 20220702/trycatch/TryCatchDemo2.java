package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDemo2 {

	public static void main(String[] args) {
		int num1 = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("10을 나눌 숫자를 입력하세요");
		
		int num2=0,result=0;
		try {
			num2 = sc.nextInt();		
			result = num1 / num2;
		}
		catch (InputMismatchException e) {
			System.out.println("숫자가 아닌 데이터입니다.");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
		catch(NullPointerException e) {
			System.out.println("null인 객체를 사용했습니다.");
		}
		catch (Exception e) {
			System.out.println("알수없는 예외가 발생했습니다. ");
			e.printStackTrace();
		}
		
		System.out.printf("%d / %d = %d\n",num1,num2,result);
		

	}

}
