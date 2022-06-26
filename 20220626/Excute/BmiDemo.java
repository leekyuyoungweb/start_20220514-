package Excute;

import java.util.Scanner;

import project.CalcBmi;

public class BmiDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키(m단위)와 몸무게(kg단위)를 공백을 기준으로 입력하세요");
		double height =  sc.nextDouble();
		double weight = sc.nextDouble();
		CalcBmi cb = new CalcBmi(height, weight);
		System.out.printf("bmi %.2f, 체질량 지수 %s\n: ",
				 cb.getBmi() ,cb.resultBmi() );

	}

}
