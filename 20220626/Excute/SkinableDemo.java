package Excute;

import inter.Skinable;
import project.Color;
import project.SkinableComputer;

public class SkinableDemo {

	public static void main(String[] args) {
		Skinable computer = new SkinableComputer();
		computer.changeSkin(Color.GREEN);
		// 컴퓨터의 색상 출력하기
//		if(computer instanceof SkinableComputer)
//			System.out.printf("주문하신 컴퓨터의 색상은 : %s 입니다.\n", ((SkinableComputer)computer).getSkin()  );
		
		System.out.printf("주문하신 컴퓨터의 색상은 : %s 입니다.\n", computer.getSkin() );
	}

}
