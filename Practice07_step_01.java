public class Practice07_step_01 {

	public static void main(String[] args) {
		
		int rows = 9;
		int cols = 9;
		int[][] multiArray = new int[rows][cols];
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				multiArray[i][j] = (i+1)*(j+1);
				System.out.print(multiArray[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
