import java.util.Scanner;

public class practice02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("input a number 0-24");
		int num = scan.nextInt();
		
		if (num >= 0 && num <= 5 || num == 24) {
			System.out.println(num + "時 good night");
		}else if (num >= 6 && num <= 11) {
			System.out.println(num + "時 good morning");
		}else if (num >= 12 && num <= 17) {
			System.out.println(num + "時 good afternoon");
		}else if (num >= 18 && num <= 23) {
			System.out.println(num + "時 good evening");
		}else {
			System.out.println("Please input a number 0-24");
		}

	}

}
