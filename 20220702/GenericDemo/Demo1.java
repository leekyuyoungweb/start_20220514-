package GenericDemo;

import java.util.ArrayList;
import java.util.List;

import generic.Bear;
import generic.Boricha;
import generic.Cup;

public class Demo1 {

	public static void main(String[] args) {
		Cup<Bear> c = new Cup<Bear>();
		c.setBeverage(new Bear());
		Bear b =  c.getBeverage();
		//c.setBeverage(new Boricha());	

		
		Cup c2 = new Cup();
		c2.setBeverage(new Boricha());
		Boricha bori = (Boricha) c2.getBeverage();

	}

}
