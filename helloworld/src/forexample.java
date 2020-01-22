
public class forexample {
	public static void main(String[] args) {
		char chr1 = 64;
		for (int i = 0; i < 26; i++) {
			chr1 = (char) (chr1 + 1);//연산을쓰는것만으로 int형 
			System.out.println(chr1);//방법 1
			//chr1 = (char) (chr1 + 1); <이거 지우고 방법 2
			//char chr1 = 65; 바꾸고 
			//System.out.println(chr1++);
			
		}
	}

}
