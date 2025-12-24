import java.util.Scanner;

public class Practice08_step_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("入力の回数を数字で入力してください->");
		
		for (int i = 0; i < 11; i++) {

			int num = scan.nextInt();
			if (num > -1 && num < 11) {
				String[] arry = new String[num];
				
				System.out.println("--入力開始--");
				
				for (int j = 0; j < num; j++) {
					System.out.print(j+1 + "回目の入力->");
					arry[j] = scan.next();
				}
				
				System.out.println("--入力終了--");
				
				for(String data: arry) {
					System.out.print(data + " ");
				}
			}else {
				System.out.print("0-10の間で回数を指定してください->");		
			}
		}

	}
}

