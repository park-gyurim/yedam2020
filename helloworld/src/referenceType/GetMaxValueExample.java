package referenceType;

public class GetMaxValueExample {
	public static void main(String[] args) {
		
		
		int intAry[] = { 8, 7, 10, 5, 9 };
		int max = 0;
		
		for (int i = 0; i < intAry.length; i++)
			if (max < intAry[i]) {
				max = intAry[i];
			}
		System.out.println("최소값은: " + max);
	}
}
