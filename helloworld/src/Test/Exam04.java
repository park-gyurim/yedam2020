package Test;

public class Exam04 {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0)
				sum += i;
		}
		System.out.println("2의 배수이거나 3의 배수의 합은 : "+ sum);
	}
}
