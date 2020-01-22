//for형 데이터타입
public class VeriableType {
	public static void main(String[] args) {
		byte var1, var2;
		int sum;
		var1 = 55;
		var2 = 33;
		sum = var1 + var2;
		
		char chr1 = 64;
		for (int i = 0; i < 26; i++) {
			chr1 = (char) (chr1 + 1);//연산을쓰는것만으로 int형 
			System.out.println(chr1);
		}
	
	}

}
