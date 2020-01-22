//int형 데이터 타입	
public class VariableScope {
	public static void main(String[] args) {
		int sum, var1;
		
		if(true)	{
			int var2;
			var1 = 10;
			var2 = 20;
			//var2 = 50; var1=var2 = sum(60)
			sum = var1 + var2;
			System.out.println("두수의 합은: " + sum);
		}
		    System.out.println(var1);
//		    System.out.println(var2);//var2는 if block가능
		    System.out.println(sum);
		    sum = 50;// 새로 값을 줌
		    System.out.println(sum);// (sum=60) 변수는 값을 담아놓기 위한곳
		    
		    for ( int i = 0; i < 5; i++) {
		    	var1 = var1 +1;
		    int var2 = 10;
		    System.out.println("var1: " + var1 + ", var2: " + var2);
		    } 
	}
//	System.out.println("var1: " + var1 + ", var2: " + var2)
}
