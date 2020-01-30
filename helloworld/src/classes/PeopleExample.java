package classes;

public class PeopleExample {
	public static void main(String[] args) {
		
		People p1 = new People("박규림", 29, 0, 0, "여기요");
		
		System.out.println("이름은: " + p1.name);
		System.out.println("나이는: " + p1.age);
		System.out.println(p1.address);
		
		
//		People ppl = new People();
//		ppl.name = "parkgyurim";
//		ppl.age = 29;
//		ppl.height = 170;
//		ppl.weight = 75;
//		ppl.Secretheight = 50;
//		
//		System.out.println("이름은: " + ppl.name);
//		System.out.println("나이는: " + ppl.age);
//		System.out.println("키는: " + ppl.height);
//		System.out.println("무게는: " + ppl.weight);
//		ppl.feeling();
//		System.out.println(ppl.getSecretheight());
	}

}
