
public class ArrayExample {
	public static void main(String[] args) {
		int[] intAry = { 2, 3, 4, 5 };

		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
//		intAry[0] = 20;
//		intAry[1] = 30;
		for (int i = 0; i < 4; i++) {
			intAry[i] = i * 10 + 10;

		}
		System.out.println("++++++++++++++++++++++");
		for (int i = 0; i < 4; i++) {
			System .out.println(intAry[i]);
		}
		System.out.println("+++++++++++++++++");
		int sum = 0;
		for (int i = 0; i < 4; i++) {
//			sum = sum + intAry[i];
			sum += intAry[i];
		}
		System.out.println("썸의 값은 :" + sum);

	}
//		System.out.println(intAry[0]);
//		System.out.println(intAry[1]);
}
