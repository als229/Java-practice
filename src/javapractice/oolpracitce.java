package javapractice;

//6-1 
//class Student {
//	String name;
//	int ban;
//	int no;
//	int kor;
//	int eng;
//	int math;
//}







//6-2 ��... ���� ��Ծ���. ������������ 
//public class oolpracitce {
//
//	public static void main(String[] args) {
//		Student s = new Student("�����",1,1,100,60,76);
//		
//		String str = s.info();
//		System.out.println(str);
//	}
//}
////
//class Student {
//	String name;
//	int ban;
//	int no;
//	int kor;
//	int eng;
//	int math;
//	
//	Student(String name, int ban, int no, int kor, int eng, int math) {
//		this.name = name;
//		this.ban = ban;
//		this.no = no;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	
//	}
//	public String info() {
//		return name + "," + ban+ "," +no+ "," +kor+ "," +eng+ "," +math+ "," + 
//				(kor+eng+math)+ "," +(int)((kor+eng+math)/3f*10 +0.5f) / 10f;
//	}
//}



//6-3 �����ϸ鼭 ������ �غ��� �� �������� �ܵ��
public class oolpracitce {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "����α����";
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

//6-4 ���� �Ÿ� ���ϴ� ������ (x-x1)����+(y-y1)���� ��ü�� ��Ʈ�̴�����
//						Math.sqrt ��༮�� ��Ʈ ���ִ� �޼���
//public class oolpracitce {
//
//	static double getdistance(int x, int y, int x1, int y1) {
//		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(getdistance(1,1,2,2));
//	}
//}

		


//6-6 ���θ޼��� ��ġ�� ��ü�� �����ϰ� �ߴ��� ������ �ȵƴ�. Ŭ���� ��������Ʈ�� �ܺη� ������ ������ �ȴ�.
//ã�ƺ��� static method �ȿ��� static���� ������� ���� class�� ����, ����� �� ��Ÿ���� ������ �Ѵ�.
//���� ��Ȯ�� ������ �������� ���� �� ����. 6�� 7�� �����ض���
class Mypoint {	
	int x;
	int y;

	Mypoint(int x, int y) {
		this.x=x;
		this.y=y;
	}

	double getdistance (int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	}

}
public class oolpracitce {

	public static void main(String[] args) {
		Mypoint p = new Mypoint(1,1);

		System.out.println(p.getdistance(2,2));
	}
}

















