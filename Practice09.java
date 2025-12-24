import java.util.Scanner;
public class Practice09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("名前を入力してください->");
		String str1 = scan.next();
		
		System.out.print("趣味を入力してください->");
		String str2 = scan.next();
		
		System.out.print("何か一言を入力してください->");
		String str3 = scan.next();
		
		System.out.println("-------------------------");

//		引数なし・戻り値なし
		result1();

//		引数あり・戻り値なし・日本語
		result2(0);

//		引数あり・戻り値なし・英語
		result2(1);

//		引数なし・戻り値あり
		String str4 = result3();
		System.out.println(str4);

//		引数あり・戻り値あり・日本語
		str4 = result5(str1,str2,str3,0);
		System.out.println(str4);

//		引数あり・戻り値あり・英語
		str4 = result5(str1,str2,str3,1);
		System.out.println(str4);
		
	}
		
//	引数なし・戻り値なし
	public static void result1() {
		System.out.println("◆引数なし・戻り値なし\n私の名前は〇です\n趣味は▼です\n頑張ります。\n");
	}
		
//	引数あり・戻り値なし
	public static void result2(int intArg) {
		if(intArg == 0) {
			System.out.println("◆引数あり・戻り値なし・日本語\n私の名前は〇です\n趣味は▼です\n頑張ります。\n");
		} else {
			System.out.println("◆引数あり・戻り値なし・英語\nMy name is 〇\nHobby is ▼\nI will do my best.\n");
		}
	}
		
//	引数なし・戻り値あり
	public static String result3() {
		String str5 = "◆引数なし・戻り値あり\n私の名前は〇です\n趣味は▼です\n頑張ります。\n";
		return str5;
	}
		
//	引数あり・戻り値なし
	public static String result5(String str1, String str2, String str3, int intArg) {
		String strTmp="";
		if(intArg == 0) {
			strTmp="◆引数あり・戻り値なし・日本語\n私の名前は" + str1 + "です\n趣味は" + str2 + "です\n" + str3 + "。\n";
		} else {
			strTmp="◆引数あり・戻り値なし・英語\nMy name is " + str1 + "\nHobby is " + str2 + "\n" + str3 + "\n";
		}
		return strTmp;
	}
		
		
		
		


}
