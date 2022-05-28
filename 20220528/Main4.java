/**
 * 
 * 순환문을 제어 (for loop  ,while loop)
 * break, continue
 * 
 * break --> switch
 *
 */
public class Main4 {

	public static void main(String[] args) {
		
		// 무한루프
		int count = -1;
		while(count<5) {		
			count++;
			
			if(count == 3)
				continue;
			
			System.out.println(count);
		}

	}

}
