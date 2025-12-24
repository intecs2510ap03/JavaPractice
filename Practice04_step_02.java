import java.util.Scanner;

public class Practice04_step_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("１つ目の数値-> ");
		int num1 = scan.nextInt();
		System.out.print("２つ目の数値-> ");
		int num2 = scan.nextInt();
		
		int i;
		int cntFizz =0;
		int cntBuzz =0;
		int cntFizzBuzz =0;
		int cntOther =0;
		
		if (num1 < num2) {
			for (i = num1; i <= num2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.print("FizzBuzz ");
					cntFizzBuzz++;
				}else if (i % 3 == 0) {
					System.out.print("Fizz ");
					cntFizz++;
				}else if (i % 5 == 0) {
					System.out.print("Bizz ");
					cntBuzz++;
				}else {
					System.out.print(i + " ");
					cntOther++;
				}
			}
			
			// 出力
			System.out.println("");
			System.out.println("Fizz:" + cntFizz);
			System.out.println("Buzz:" + cntBuzz);
			System.out.println("FizzBuzz:" + cntFizzBuzz);
			System.out.println("該当なし:" + cntOther);
			
		}else {
			System.out.print("１つ目の数値は２つ目の数値より小さい数字を入力してください");
		}

	}

}
