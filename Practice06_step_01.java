
public class Practice06_step_01 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		do {
			sum += i;
			i++;
		}while (i < 101);

		System.out.println("---0 ～ 100の総和---");
		System.out.println(sum);

	}

}
