package Test;

public class Student {


	public static String name;
	public static String sutudentNumber;
	public static String englishScore;
	public static String mathScore;



	public static void main(String[] args) {
		name = "박규림";
		sutudentNumber = "101010";
		englishScore = "100";
		mathScore = "100";
		
		System.out.println("저의 이름은" + name + "입니다");
		System.out.println("저의 학번은" + sutudentNumber + "입니다");
		System.out.println("저의 영어점수는" + englishScore + "입니다");
		System.out.println("저의 수학점수는" + mathScore + "입니다");
		
	}
	public Student() {
	
	}

	
	public Student(String name, String sutudentNumber, String englishScore, String mathScore) {

		this.name = name;
		this.sutudentNumber = sutudentNumber;
		this.englishScore = englishScore;
		this.mathScore = mathScore;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSutudentNumber() {
		return sutudentNumber;
	}

	public void setSutudentNumber(String sutudentNumber) {
		this.sutudentNumber = sutudentNumber;
	}

	public String getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(String englishScore) {
		this.englishScore = englishScore;
	}

	public String getMathScore() {
		return mathScore;
	}

	public void setMathScore(String mathScore) {
		this.mathScore = mathScore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sutudentNumber=" + sutudentNumber + ", englishScore=" + englishScore
				+ ", mathScore=" + mathScore + "]";
	}

}
