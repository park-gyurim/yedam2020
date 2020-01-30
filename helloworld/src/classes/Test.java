package classes;

public class Test {
	public static void main(String[] args) {
		int[] ary = { 11, 2, 43, 4, 51 };
		int max = 0;
		for (int i = 0; i < ary.length; i++) {
			for (int j = i + 1; j < ary.length; j++) {
				if (ary[i] < ary[j]) {
					max = ary[i];
					ary[i] = ary[j];
					ary[j] = max;
					
				}
			}
			
		}
	      	for (int a = 0; a < ary.length; a++)
			System.out.println(ary[a]);
		
	}

}
