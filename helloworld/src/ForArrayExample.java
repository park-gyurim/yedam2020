
public class ForArrayExample {
	public static void main(String[] args) {
		int[] intAry = new int[100];
		for (int i = 0; i <= 99; i++) {
			intAry[i] = i + 1;
		}

		System.out.println("+++++++++++++++++");
		int sum = 0;
		for (int i = 0; i <= 99; i++) {
			if (i % 2 == 0)
			
			{
				sum += intAry[i];

			}
		}
		System.out.println("홀수번째의 합은" + sum);

	}
//			sum += intAry[i];
}
