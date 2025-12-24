import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("入力の回数を数字で入力してください->");
		int num = scan.nextInt();
		
		String[] arry = new String[num];
		
		System.out.println("--入力開始--");
		
		for (int i = 0; i < num; i++) {
			System.out.print(i+1 + "回目の入力->");
			arry[i] = scan.next();
		}
		
		System.out.println("--入力終了--");
		
		for(String data: arry) {
			System.out.print(data + " ");
		}

	}

}
