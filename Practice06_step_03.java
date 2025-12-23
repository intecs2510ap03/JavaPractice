import java.util.Scanner;

public class Practice06_step_03 {

	public static void main(String[] args) {

		int sum = 0;
		int sumOdd = 0;
		int sumEven = 0;
		int i = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("開始の数->");
		int num1 = scan.nextInt();
		System.out.print("終了のの数->");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("開始の数は終了の数より小さくなければなりません");
		}else {
			
			i = num1;
			while (i <= num2) {
				if (i % 2 == 0) {
					sumEven += i;
				}else {
					sumOdd += i;
				}
				sum += i;
				i++;
			}

			System.out.println("---" + num1 + " ～ " + num2 + "の総和---");
			System.out.println(sum);

			System.out.println("---" + num1 + " ～ " + num2 + "の偶数総和---");
			System.out.println(sumEven);
			
			System.out.println("---" + num1 + " ～ " + num2 + "の奇数総和---");
			System.out.println(sumOdd);
			
		}

	}

}
