
public class LoopExample {
	public static void main(String[] args) {

		for (int j = 1; j <= 100; j++) {
			if (j % 3 == 0 && j % 7 == 0)
				System.out.println("1~100의 합 중에 3의 배수이면서 7의 배수는" + j);
		}
		
	System.out.println("+++++++++++++++++++++++++++");
	
		int i = 1;
		while (i <= 100) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.println("1~100의 합 중에 3의 배수이면서 7의 배수는" + i);
			}
			i++;
		}
	}
} 