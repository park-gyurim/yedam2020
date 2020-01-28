
public class WhileSumExample {
	public static void main(String[] args) {
		int i = 5, o = 0;
		while (i == 5) {
			if (o == 9) {
				i++;
			} else {
				o++;
				System.out.println("5단     " + i + "X" + o + "=" + (i * o));

			}
		}	
	}
}
