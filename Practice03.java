import java.util.Scanner;
public class Practice03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please input a number 1-12 ->");
		int month = scan.nextInt();
		
		switch (month) {
		case 1:
			System.out.println("睦月");
			break;
		case 2:
			System.out.println("如月");
			break;
		case 3:
			System.out.println("弥生");
			break;
		case 4:
			System.out.println("卯月");
			break;
		case 5:
			System.out.println("皐月");
			break;
		case 6:
			System.out.println("水無月");
			break;
		case 7:
			System.out.println("文月");
			break;
		case 8:
			System.out.println("葉月");
			break;
		case 9:
			System.out.println("長月");
			break;
		case 10:
			System.out.println("神無月");
			break;
		case 11:
			System.out.println("霜月");
			break;
		case 12:
			System.out.println("師走");
			break;
		default:
			System.out.println("please input a number 1-12");
			break;
		}
		
		

	}

}
