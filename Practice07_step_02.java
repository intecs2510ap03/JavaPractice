public class Practice07_step_02 {

	public static void main(String[] args) {
		
		int rows = 9;
		int cols = 9;
		int[][] multiArray = new int[rows][cols];
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				multiArray[i][j] = (i+1)*(j+1);
			}
		}
		
		for (int[] data: multiArray) {
			for (int value: data) {
				System.out.print(value + " ");
			}
			System.out.println("");
			
		}

	}

}
