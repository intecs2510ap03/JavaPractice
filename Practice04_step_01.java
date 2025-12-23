import java.util.Scanner;

public class Practice04_step_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("１つ目の数値-> ");
		int num1 = scan.nextInt();
		System.out.print("２つ目の数値-> ");
		int num2 = scan.nextInt();
		
		int i;
		if (num1 < num2) {
			for (i = num1; i <= num2; i++) {
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
		}else {
			System.out.print("１つ目の数値は２つ目の数値より小さい数字を入力してください");
		}

	}

}
