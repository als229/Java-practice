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







//6-2 후... 많이 까먹었다. 복습복습복습 
//public class oolpracitce {
//
//	public static void main(String[] args) {
//		Student s = new Student("김관민",1,1,100,60,76);
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



//6-3 이해하면서 여러번 해보기 왜 없어졌어 잔디야
//public class oolpracitce {
//
//	public static void main(String[] args) {
//		Student s = new Student();
//		s.name = "김관민";
//		s.ban = 1;
//		s.no = 1;
//		s.kor = 100;
//		s.eng = 60;
//		s.math = 76;
//		System.out.println("이름 ="+s.name);
//		System.out.println("총점 ="+s.gettotal());
//		System.out.println("평균 ="+s.getaverage());
//	}
//
//}
//
//class Student {
//	String name;
//	int ban;
//	int no;
//	int kor;
//	int eng;
//	int math;
//	
//	Student (){}
//	
//	Student(String name, int ban, int no, int kor, int eng, int math) {
//		this.name = name;
//		this.ban = ban;
//		this.no = no;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	}
//	int gettotal( ) {
//		return kor+eng+math;
//	}
//	float getaverage() {
//		return (int)(gettotal() / 3f *10 + 0.5f) / 10f;
//	}
//	public String info() {
//		return name
//				+ "," +ban
//				+ "," +no
//				+ "," +kor
//				+ "," +eng
//				+ "," +math
//				+ "," +gettotal()
//				+ "," +getaverage()
//				;
//	}
//}

//6-4 두점 거리 구하는 공식은 (x-x1)제곱+(y-y1)제곱 전체에 루트이다�詰�
//						Math.sqrt 요녀석이 루트 해주는 메서드
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

		


//6-6 메인메서드 위치를 전체를 포함하게 했더니 실행이 안됐다. 클래스 마이포인트를 외부로 보내야 실행이 된다.
//찾아보니 static method 안에서 static으로 선언되지 않은 class를 생성, 사용할 때 나타나는 오류라 한다.
//아직 정확한 개념을 이해하지 못한 것 같다. 6장 7장 복습해라잉
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

















