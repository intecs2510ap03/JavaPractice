import java.util.Scanner;
public class Practice10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("--数値を2回入力してください--");
		System.out.print("１つ目の数値->");
		int num1 = scan.nextInt();
		System.out.print("２つ目の数値->");
		int num2 = scan.nextInt();
		
		
		//加算
		int numAdd = addResult(num1,num2);
		
		//減算
		int numSub = subResult(num1,num2);
		
		//乗算
		int numMult = multResult(num1,num2);
		
		//徐算
		int numDiv = divResult(num1,num2);
		
		//出力
		System.out.println("---計算結果---");
		System.out.println("加算：" + numAdd);
		System.out.println("減算：" + numSub);
		System.out.println("乗算：" + numMult);
		System.out.println("徐算：" + numDiv);
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
