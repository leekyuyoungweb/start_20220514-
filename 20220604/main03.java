
public class main03 {

	public static void main(String[] args) {
		
//		int[] ary1th = {1,2,3};
//		
//		int[][] ary2th = {
//				{1,2,3},{1,2,3},{1,2,3}
//		};
//		
//		int[][][] ary3th = {
//				{
//					{1,2,3},{1,2,3},{1,2,3}
//				},
//				{
//					{1,2,3},{1,2,3},{1,2,3}
//				},
//				{
//					{1,2,3},{1,2,3},{1,2,3}
//				}
//			};
		int[] ary1th = new int[3];
		for (int i = 0; i < ary1th.length; i++) {
			ary1th[i] = i+1;
		}
		
		int[][] ary2th = new int[3][3];
		for (int i = 0; i < ary2th.length; i++) {
			for (int j = 0; j < ary2th[i].length; j++) {
				ary2th[i][j] = j+1;
			}
		}
		
		
	}

}












