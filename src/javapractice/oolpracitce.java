package javapractice;


//6-1 �����ϸ鼭 ������ �غ���
public class oolpracitce {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "�����";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("�̸� ="+s.name);
		System.out.println("���� ="+s.gettotal());
		System.out.println("��� ="+s.getaverage());
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
		
		

















