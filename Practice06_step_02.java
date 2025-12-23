
public class Practice06_step_02 {

	public static void main(String[] args) {
		int sumOdd = 0;
		int sumEven = 0;
		int i = 0;
		
		while (i < 101) {
			if (i % 2 == 0) {
				sumEven += i;
			}else {
				sumOdd += i;
			}
			i++;
		}

		System.out.println("---0 ～ 100の偶数総和---");
		System.out.println(sumEven);
		
		System.out.println("---0 ～ 100の奇数総和---");
		System.out.println(sumOdd);

	}

}
