package classes;

//public은 패키지가 달라도 쓰일 수 있게 하는 것
public class Student {
   // 속성(필드)
   private String name;
   private int age;
   private int height;
   private int weight;

   // 생성자 (인스턴스를 만들면서 필드값을 초기화)
   Student() {

   }

   Student(String name) {
//this는 필드를 이야기할때 적어줌. 매개값과 필드이름이 같으므로
      // 구분해주기위하여 사용
      this.name = name;
   }

   Student(String name, int age, int height, int weight) {
      this.name = name;
      this.age = age;
      this.height = height;
      this.weight = weight;
   }

   // 기능&동작(method)
   void study() {
      System.out.println("공부한다");
   }

   void eat() {
      System.out.println("밥을 먹는다");
   }

   void sleep() {
      System.out.println("잠을 잔다");
   }

   // 값을 넣어주는 방법 this.를 사용해서 매게값과 필드값을 구분시켜줌. this.age가 매개값
   void setAge(int age) {
      if (age >= 0)
         this.age = age;
      else
         this.age = 0;
   }

//age필드를 반환해준다. age가 int이므로 int타입으로 메서드 지정해줌 (값을 입력하는 방법)
   int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getHeight() {
      return height;
   }

   public void setHeight(int height) {
      this.height = height;
   }

   public int getWeight() {
      return weight;
   }

   public void setWeight(int weight) {
      this.weight = weight;
   }


}