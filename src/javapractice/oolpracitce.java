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







//6-2 ÈÄ... ¸¹ÀÌ ±î¸Ô¾ú´Ù. º¹½Àº¹½Àº¹½À 
//public class oolpracitce {
//
//	public static void main(String[] args) {
//		Student s = new Student("±è°ü¹Î",1,1,100,60,76);
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



//6-3 ÀÌÇØÇÏ¸é¼­ ¿©·¯¹ø ÇØº¸±â ¿Ö ¾ø¾îÁ³¾î ÀÜµğ¾ß
public class oolpracitce {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "±è°ü¹Î±è°ü¹Î";
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

//6-4 µÎÁ¡ °Å¸® ±¸ÇÏ´Â °ø½ÄÀº (x-x1)Á¦°ö+(y-y1)Á¦°ö ÀüÃ¼¿¡ ·çÆ®ÀÌ´ÙÉış°
//						Math.sqrt ¿ä³à¼®ÀÌ ·çÆ® ÇØÁÖ´Â ¸Ş¼­µå
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

		


//6-6 ¸ŞÀÎ¸Ş¼­µå À§Ä¡¸¦ ÀüÃ¼¸¦ Æ÷ÇÔÇÏ°Ô Çß´õ´Ï ½ÇÇàÀÌ ¾ÈµÆ´Ù. Å¬·¡½º ¸¶ÀÌÆ÷ÀÎÆ®¸¦ ¿ÜºÎ·Î º¸³»¾ß ½ÇÇàÀÌ µÈ´Ù.
//Ã£¾Æº¸´Ï static method ¾È¿¡¼­ staticÀ¸·Î ¼±¾ğµÇÁö ¾ÊÀº class¸¦ »ı¼º, »ç¿ëÇÒ ¶§ ³ªÅ¸³ª´Â ¿À·ù¶ó ÇÑ´Ù.
//¾ÆÁ÷ Á¤È®ÇÑ °³³äÀ» ÀÌÇØÇÏÁö ¸øÇÑ °Í °°´Ù. 6Àå 7Àå º¹½ÀÇØ¶óÀ×
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

















