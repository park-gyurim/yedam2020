
public class ForSumExample {
	public static void main(String[] args) {
		int sum = 0;
		for(int i  = 1; i <= 30; i++) {
			sum = sum + 1;
			System.out.println("i: " + i + ", sum: " + sum);
			i = i + 3;
	 
		}
//		sum = sum + 1;
//		sum = sum + 2;
//		sum = sum + 3;
//		sum = sum + 4;
//		sum = sum + 5;
		
		System.out.println("합계는: " + sum);
	}

}
