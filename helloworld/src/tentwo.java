
public class tentwo {

	public static void main(String[] args) {
		String result = getDigtnumber(37);
		System.out.println(result);
	}

	static String getDigtnumber(int num) {
		String result = " ";
		int num2 = 0;//나머지
		int num1 = num;//몫을 담는 값, 처음 num1은 num선언수37이고 한번돌아올때마다 바뀜
		while (true) {
			num2 = num1 % 2;// 37을 2로 나웠을때 나머지, 현재 num2는 1
			result = num2 + result;// 나머지
			num1 = num1 / 2;// 여기서 새로 num1은 입력값을 2로 나눴는 값
			if (num1 == 0){
				
				break;
			}
		}
		return result;
	}
}