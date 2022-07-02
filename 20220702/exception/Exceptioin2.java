package exception;
import java.util.StringTokenizer;
/**
 * 비검사... 즉 컴파일러가 검사지 않고 실행시점에 잘못되면 Exception 발생
 * 실행예외
 * RuntimeException
 */

public class Exceptioin2 {

	public static void main(String[] args) {
		String s = "Time is money";
		StringTokenizer st = new StringTokenizer(s);
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken() + "+");
		}
		System.out.print(st.nextToken());

	}

}
