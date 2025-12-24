import java.util.Scanner;
public class Practice10_step_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ary = 5;
		int[] arryResult = new int[ary];
		int i=0;
		
		while(true) {
			System.out.println("--演算の種別を選択してください（0で終了）--");
			System.out.print("1：加算、2：減算、3：乗算、4：除算->");
			int num0 = scan.nextInt();
			
			if (num0 == 0) {
				System.out.println("---計算終了---");
				System.exit(0);
			} else if(num0 > 4){
				System.out.println("--1～4の数字を入力してください--");
				continue;
			}
			
			//計算の種別を取得する
			String strCal = calMsg(num0);
			System.out.println("--" + strCal + "を選択しています--");
			
			//数値を2つ入力してもらう
			System.out.print("１つ目の数値->");
			int num1 = scan.nextInt();
			System.out.print("２つ目の数値->");
			int num2 = scan.nextInt();
	
			System.out.println("---計算結果---");
			
			//計算結果を取得し、計算結果の配列に格納する
			int calResult = calResult(num1, num2, num0);
			System.out.println(strCal + "：" + calResult);
			arryResult[i]=calResult;
			
			//計算結果の配列の出力
			System.out.print("計算の記録：");
			for(int j=0; j < 5; j++) {
				System.out.print("[" + arryResult[j] + "]");
			}
			
			//計算結果の配列をカウントアップまたは初期化する
			if(i==4) {
				i=0;
			} else {
				i++;
			}

			//改行
			System.out.println("");
		}
	}
	
	public static int calResult(int num1, int num2, int num0) {
		
		switch(num0) {
		case 1:
			//加算
			return num1 + num2;
			
		case 2:
			//減算
			return num1 - num2;
		
		case 3:
			//乗算
			return num1 * num2;
		default:
			//徐算
			return num1 / num2;
		}
	}
	
	public static String calMsg(int num0) {
		
		switch(num0) {
		case 1:
			//加算
			return "加算";
			
		case 2:
			//減算
			return "減算";
		
		case 3:
			//乗算
			return "乗算";
		default:
			//徐算
			return "徐算";
		}
	}
	
}

