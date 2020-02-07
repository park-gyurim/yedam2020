package Practice;

import java.sql.Connection;
import java.util.Scanner;

public class ElectricitByill {

	public static void main(String[] args) {
		
		getConnect();
	}
		
	public static int getConnect() {
	Scanner scn = new Scanner(System.in);
		int kwh = 0;

		int bCharge = 0;
		int bCharge1 = 0;
		int bCharge2 = 0;
		int bCharge3 = 0;
		int eCharge = 0;
		int eCharge1 = 0;
		int eCharge2 = 0;
		int eCharge3 = 0;

		while (true) {
			
			int i = kwh;

			System.out.println("사용량을 입력하시오: ");
			kwh = scn.nextInt();

			// 전기사용량별 기본요금
			// 전기사용요금 계산

			if (1 < i && i <= 100) {
				bCharge = 100;
				eCharge = (i * bCharge);
			} else if (101 < i && i <= 200) {
				bCharge1 = 150;
				eCharge1 = (i * bCharge1);
			} else if (201 < i && i <= 300) {
				bCharge2 = 230;
				eCharge2 = (i * bCharge2);
			} else if (301 < i) {
				bCharge3 = 300;
				eCharge3 = (i * bCharge3);
			}
			{
				System.out.println("요금은: " + eCharge + "입니다");
			}
			
			return i;
			
			{
				System.out.println("요금은: " + eCharge1 + "입니다");
			}
			return i;
			{
				System.out.println("요금은: " + eCharge2 + "입니다");
			}
			return i;
			{
				System.out.println("요금은: " + eCharge3 + "입니다");
			}
			return i;
			{

			}
			
		}
	}
}
