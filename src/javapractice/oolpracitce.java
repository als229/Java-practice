package javapractice;


//6-1 ÀÌÇØÇÏ¸é¼­ ¿©·¯¹ø ÇØº¸±â
public class oolpracitce {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "±è°ü¹Î";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("ÀÌ¸§ ="+s.name);
		System.out.println("ÃÑÁ¡ ="+s.gettotal());
		System.out.println("Æò±Õ ="+s.getaverage());
	}

}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student (){}
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	int gettotal( ) {
		return kor+eng+math;
	}
	float getaverage() {
		return (int)(gettotal() / 3f *10 + 0.5f) / 10f;
	}
	public String info() {
		return name
				+ "," +ban
				+ "," +no
				+ "," +kor
				+ "," +eng
				+ "," +math
				+ "," +gettotal()
				+ "," +getaverage()
				;
	}
}
		
		

















