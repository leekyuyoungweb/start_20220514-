
public class HumanMain {

	public static void main(String[] args) {
		Human h = new Human();
		if(!h.setName("홍길동"))
			return;
		
		// height 셋팅
		if(!h.setHeight(150))
			return;
		// weight 셋팅
		if(!h.setWeight(60))
			return;
		
		
		System.out.printf("name = %s, height = %d, weight = %d\n",
				h.getName(),h.getHeight()  , h.getWeight() );
		
	}

}
