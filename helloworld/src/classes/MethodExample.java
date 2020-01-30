package classes;

public class MethodExample {
public static void main(String[] args) {
	
//	int num1 = 10, num2 = 15;
//	
//	int result = sum(num2, num2) * minus(num1, num2);
//	System.out.println("결과값은: " + result);
	
	Method m = new Method();
	m.setLeftField(30);
	m.setRightField(4);
	int result = m.thisSum() + m.thisMinus();
	int result2 = m.sum(20, 10) * m.minus(30, 25);
	System.out.println("필드의 계산결과: " + result);
	System.out.println("두 매개값의 걔산결과: " + result2);
}
	
}
