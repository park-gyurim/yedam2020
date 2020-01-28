
public class WhileExample {
	public static void main(String[] args) {
		int i = 0;
			while(true) {
			i = (int) (Math.random() * 6) + 1;
			System.out.println(i);
			if(i == 6) {
				break;
			}
		}
	}
}
