
public class WhileSumExapmee {
	public static void main(String[] args) {
		
	int sum = 0 ;
	int i = 1;
	while (i <= 100) {
		if (i % 2 == 0) {
		
		sum = sum + i ;
		System.out.println(i);
		System.out.println(sum);
		}
		i++;
	}

	System.out.println("합계는 " + sum);
	}

}
