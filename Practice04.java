public class Practice04 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 21; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("FizzBuzz ");
			}else if (i % 3 == 0) {
				System.out.print("Fizz ");
			}else if (i % 5 == 0) {
				System.out.print("Bizz ");
			}else {
				System.out.print(i + " ");
			}
			
		}

	}

}
