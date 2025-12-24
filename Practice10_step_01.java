import java.util.Scanner;
public class Practice10_step_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("--演算の種別を選択してください（0で終了）--");
		System.out.print("1：加算、2：減算、3：乗算、4：除算->");
		int num0 = scan.nextInt();
		
		switch(num0) {
		case 1:
			System.out.println("--加算を選択しています--");
			break;
		case 2:
			System.out.println("--減算を選択しています--");
			break;
		case 3:
			System.out.println("--乗算を選択しています--");
			break;
		case 4:
			System.out.println("--徐算を選択しています--");
			break;
		case 0:
			System.out.println("---計算終了---");
			System.exit(0);
			break;
		default:
			System.out.println("--1～4の数字ではないので処理を終了します--");
			System.exit(0);
			break;
		}
		
		
		System.out.print("１つ目の数値->");
		int num1 = scan.nextInt();
		System.out.print("２つ目の数値->");
		int num2 = scan.nextInt();

		System.out.println("---計算結果---");
		
		switch(num0) {
		case 1:
			//加算
			int numAdd = addResult(num1,num2);
			System.out.println("加算：" + numAdd);
			break;

		case 2:
			//減算
			int numSub = subResult(num1,num2);
			System.out.println("減算：" + numSub);
			break;
		
		case 3:
			//乗算
			int numMult = multResult(num1,num2);
			System.out.println("乗算：" + numMult);
			break;
		default:
			//徐算
			int numDiv = divResult(num1,num2);
			System.out.println("徐算：" + numDiv);
			break;
		}
		
		System.out.println("---計算終了---");

	}

	//加算
	public static int addResult(int num1, int num2) {
		return num1 + num2;
	}

	//減算
	public static int subResult(int num1, int num2) {
		return num1 - num2;
	}

	//乗算
	public static int multResult(int num1, int num2) {
		return num1 * num2;
	}

	//徐算
	public static int divResult(int num1, int num2) {
		return num1 / num2;
	}
	
}

