import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input a number 0~3");
		int num = scan.nextInt();
		
		if (num == 0) {
			System.out.println("Good morning");
		}else if (num == 1) {
			System.out.println("Good afternoon");
		}else if (num == 2) {
			System.out.println("Good evening");
		}else if (num == 3) {
			System.out.println("Good night");
		}else {
			System.out.println("Please input a number 0~3");
		}
	}

}
