package trycatch;

public class TryCatchDemo4 {

	public static void main(String[] args) {
		Temp t = new Temp();
		t.show();
		try {
			t.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("main에서 예외처리(close에서 throw했음)");
		}
		
	}

}


