
public class Practice05_step_02 {

	public static void main(String[] args) {
		String[] fruits = {"apple","banana","grape","mango","peach"};

		System.out.println("■偶数インデックスの要素");
		for (int i = 0; i < fruits.length; i++) {
			if (i % 2 == 0) {
				System.out.print(fruits[i] + " ");
			}
			
		}
		System.out.println("");

		System.out.println("■奇数インデックスの要素");
		for (int i = 0; i < fruits.length; i++) {
			if (i % 2 != 0) {
				System.out.print(fruits[i] + " ");
			}
			
		}
	}

}

